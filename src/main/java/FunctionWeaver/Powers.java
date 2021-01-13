package FunctionWeaver;

public class Powers {
    public Powers() {}
    StringBuilder equation;
    int stringLength;

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

    public StringBuilder TestForFuture2 (StringBuilder equation) {
        System.out.println(equation + " class for second power evaluation is being reached");
        // some calculation code will go here in the future
        stringLength = equation.length();
        for(int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append("1");
        System.out.println(equation.toString() + " leaving Powers class");
        return equation;
    }
}