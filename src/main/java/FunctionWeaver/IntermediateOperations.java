package FunctionWeaver;

public abstract class IntermediateOperations {
    public IntermediateOperations() {
        super();
    }
    StringBuilder equation;
    String operator;
    String whole;
    String part;
    String number;
    int stringLength;
    int partStart;
    int partEnd;
    double base;
    double value;
    double result;
    
    public void announce() {
        System.out.println(equation.toString() + " class for " + operator + " evaluation is being reached");    
    }

    public void baseString() {
        partStart = 0;
        for (int i = 0; i < equation.length(); i++)
            if (equation.charAt(i) == '^')
            {   partEnd = i; break; }
        base = Double.parseDouble(equation.substring(partStart, partEnd).toString());
    }

    public void partString() {
        whole = equation.toString();
        for (int i = 0; i < equation.length(); i++)
            if (equation.charAt(i) == '(')
            {   partStart = i + 1; break;  }
        for (int i = partStart + 1; i < equation.length(); i++)
            if (equation.charAt(i) == ')')
            {   partEnd = i; break; }
        value = Double.parseDouble(whole.substring(partStart, partEnd).toString());
    }

    public void changeString() {
        stringLength = whole.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0,1);
        equation.insert(0, new Double(result).toString());
        System.out.println(equation.toString() + " leaving " + operator + " class");
    }
}