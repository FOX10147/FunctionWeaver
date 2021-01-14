package FunctionWeaver;

public class MDCalculator {
    public MDCalculator() {}
    StringBuilder equation;
    int stringLength;

    public StringBuilder multiply (StringBuilder equation) {
        System.out.println(equation + " class for multiplication evaluation is being reached");
        // some calculation code will go here in the future
        stringLength = equation.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append("1");
        System.out.println(equation.toString() + " leaving multiplication class");

        return equation;
    }

    public StringBuilder divide (StringBuilder equation) {
        System.out.println(equation + " class for division evaluation is being reached");
        // some calculation code will go here in the future
        stringLength = equation.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append("1");
        System.out.println(equation.toString() + " leaving division class");

        return equation;
    }
}
