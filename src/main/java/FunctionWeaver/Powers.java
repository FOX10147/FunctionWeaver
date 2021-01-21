package FunctionWeaver;

public class Powers {
    public Powers() {}
    StringBuilder equation;
    String whole;
    String part;
    String number;
    int stringLength;
    int partStart;
    int partEnd;
    double value;
    double result;

    public StringBuilder TestForFuture (StringBuilder equation) {
        System.out.println(equation + " class for power evaluation is being reached");
        // some calculation code will go here in the future
        stringLength = equation.length();
        for(int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append("1");
        System.out.println(equation.toString() + " leaving Powers class");
        return equation;
    }

    public StringBuilder exponentTest (StringBuilder equation) {
        System.out.println(equation + " class for second power evaluation is being reached");
        
        // separate the part of the string with e^() from the rest of the string
        partStart = 0;
        whole = equation.toString();
        for (int i = 0;  i < equation.length(); i++)
            if (equation.charAt(i) == ')') 
                {   partEnd = i + 1; break; }
        part = whole.substring(partStart, partEnd);
        System.out.println("part I'm getting is: " + part);

        // reach into e^() and grab the number inside the (). Calculate its e^() result.
        for (int i = 0; i < part.length(); i++)
        {   if (part.charAt(i) == '(') partStart = i + 1;
            else if (part.charAt(i) == ')') 
                {   partEnd = i; break; }
        }
        number = part.substring(partStart, partEnd).toString();
        value = Double.parseDouble(number);
        result = Math.exp(value);
        System.out.println("result is: " + result);

        // Get result and put it back into the original string to create a new string.
        stringLength = part.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0,1);
        equation.insert(0, new Double(result).toString());
        System.out.println(equation.toString() + " leaving Trig class");
        return equation;
    }
}