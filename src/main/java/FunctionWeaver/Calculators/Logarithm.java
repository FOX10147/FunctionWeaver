package FunctionWeaver.Calculators;

public class Logarithm extends IntermediateOperations {   
    public Logarithm() {
        super();
    }

    public StringBuilder LogTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Logarithm";

        announce();
        partString();

        try
        {   if (value <= 0) throw new ArithmeticException();
            result = Math.log(value);
        }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: Calculation is taking the log of a negative number or 0. Result is undefined.");
            System.out.println("Please check the domain of your equation.");
            System.exit(0);
        }
        
        System.out.println("result is: " + result);
        changeString();

        return equation;
    }
}