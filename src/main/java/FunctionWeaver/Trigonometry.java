package FunctionWeaver;

public class Trigonometry {  
    public Trigonometry() {} 
    StringBuilder equation;
    int stringLength;
    public Trigonometry (StringBuilder equation) {
        this.equation = equation;
    }

    public StringBuilder TestForFuture(StringBuilder equation) {
        System.out.println(equation.toString() + " class for Trigonometry evaluation is being reached");
        // some calculation code will go here in the future
        stringLength = equation.length();
        for(int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append("1");
        System.out.println(equation.toString() + " leaving Trig class");
        return equation;
    }
}