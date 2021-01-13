package FunctionWeaver;

public class Roots {   
    public Roots() {}
    StringBuilder equation;
    int stringLength;

    public StringBuilder TestForFuture(StringBuilder equation) {
        System.out.println(equation + " class for square root evaluation is being reached");
        // some calculation code will go here in the future
        stringLength = equation.length();
        for(int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append("1");
        System.out.println(equation.toString() + " leaving Root class");
       return equation;
    }
}