package FunctionWeaver;

public class Roots {   
    public Roots() {}
    StringBuilder equation;
    String whole;
    String part;
    String number;
    int stringLength;
    int partStart;
    int partEnd;
    double base;
    double value;
    double result;

    public StringBuilder SquareRootTest(StringBuilder equation) {
        System.out.println(equation + " class for Square Root evaluation is being reached");
        
        whole = equation.toString();
        for (int i = 0; i < equation.length(); i++)
            if (equation.charAt(i) == '(')
            {   partStart = i + 1; break;  }
        for (int i = partStart + 1; i < equation.length(); i++)
            if (equation.charAt(i) == ')')
            {   partEnd = i; break; }
        value = Double.parseDouble(whole.substring(partStart, partEnd).toString());
        result = Math.sqrt(value);
        System.out.println("result is: " + result);
        
        // Get result and put it back into the original string to create a new string.
        stringLength = whole.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0,1);
        equation.insert(0, new Double(result).toString());
        System.out.println(equation.toString() + " leaving logarithm class");
        return equation;
    }
}