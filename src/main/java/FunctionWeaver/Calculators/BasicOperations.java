package FunctionWeaver.Calculators;

abstract class BasicOperations {
    public BasicOperations() {
        super();
    }
    StringBuilder equation;
    char symbol;
    String operator;
    String left;
    String right;
    int stringLength;
    int substringLStart;
    int substringLEnd;
    int substringRStart;
    int substringREnd;
    double firstValue;
    double secondValue;
    double resultValue;

    public void announce() {
        System.out.println(equation + " class for " + operator + " evaluation is being reached");
    }

    public void assignStrings() {
        substringLStart = 0;
        substringREnd = equation.length();
        for (int i = 1; i < equation.length(); i++)
        {   if (equation.charAt(i) == symbol)
            {   substringLEnd = i;
                substringRStart = i + 1;
                break;
            }

        }
        left = equation.substring(substringLStart, substringLEnd);
        right = equation.substring(substringRStart, substringREnd);
    }

    public void calculateValues() {
        firstValue = Double.parseDouble(left);
        secondValue = Double.parseDouble(right);
        if (symbol == '*')
        {   resultValue = firstValue * secondValue; }
        else if (symbol == '/')
        {   resultValue = firstValue / secondValue; }
        else if (symbol == '+')
        {   resultValue = firstValue + secondValue; }
        else if (symbol == '-')
        {   resultValue = firstValue - secondValue; }
    }

    public void changeString() {
        stringLength = equation.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        equation.append(new Double(resultValue).toString());
        System.out.println(equation.toString() + " leaving " + operator + " class");
    }
}
