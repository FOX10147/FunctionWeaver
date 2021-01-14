package FunctionWeaver;

public class ASCalculator {
    public ASCalculator() {}
    StringBuilder equation;
    int stringLength;

    public StringBuilder add (StringBuilder equation) {
        System.out.println(equation + " class for addition evaluation is being reached");
        // some calculation code will go here in the future
        stringLength = equation.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append("1");
        System.out.println(equation.toString() + " leaving addition class");

        return equation;
    }

    public StringBuilder subtract (StringBuilder equation) {
        System.out.println(equation + " class for subtraction evaluation is being reached");
        // some calculation code will go here in the future
        stringLength = equation.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append("1");
        System.out.println(equation.toString() + " leaving addition class");

        return equation;
    }
}
