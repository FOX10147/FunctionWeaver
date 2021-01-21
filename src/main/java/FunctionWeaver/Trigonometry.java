package FunctionWeaver;

public class Trigonometry {  
    public Trigonometry() {} 
    StringBuilder equation;
    String whole;
    String part;
    String number;
    int stringLength;
    int partStart;
    int partEnd;
    double value;
    double result;

    public Trigonometry (StringBuilder equation) {
        this.equation = equation;
    }

    public StringBuilder sinTest(StringBuilder equation) {
        System.out.println(equation.toString() + " class for Trigonometry evaluation is being reached");
        
        // separate the part of the string with sin() from the rest of the string
        partStart = 0;
        whole = equation.toString();
        for (int i = 0;  i < equation.length(); i++)
            if (equation.charAt(i) == ')') 
                {   partEnd = i + 1; break; }
        part = whole.substring(partStart, partEnd);

        // reach into sin and grab the number inside the (). Calculate its sin result.
        for (int i = 0; i < part.length(); i++)
        {   if (part.charAt(i) == '(') partStart = i + 1;
            else if (part.charAt(i) == ')') 
                {   partEnd = i; break; }
        }
        number = part.substring(partStart, partEnd).toString();
        value = Double.parseDouble(number);
        result = Math.sin(value);

        // Get result and put it back into the original string to create a new string.
        stringLength = part.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0,1);
        equation.insert(0, new Double(result).toString());
        System.out.println(equation.toString() + " leaving Trig class");

        return equation;
    }
}