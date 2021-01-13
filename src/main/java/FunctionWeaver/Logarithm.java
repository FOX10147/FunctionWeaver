package FunctionWeaver;

public class Logarithm {   
    public Logarithm () {}
    StringBuilder equation;
    int stringLength;

    public StringBuilder TestForFuture(StringBuilder equation) {
        System.out.println(equation + " class for Logarithm evaluation is being reached");
         // some calculation code will go here in the future
         stringLength = equation.length();
         for(int i = 0; i < stringLength; i++)
         equation.delete(0, 1);
         
         equation.append("1");
         System.out.println(equation.toString() + " leaving Log class");
        return equation;
    }
}