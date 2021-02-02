package FunctionWeaver.Calculators;

public class Roots extends IntermediateOperations {   
    public Roots() {
        super();
    }
    

    public StringBuilder SquareRootTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Roots";

        announce();
        partString();

        try        
        {   if (value < 0) throw new ArithmeticException();
            result = Math.sqrt(value);  
        }
        catch (ArithmeticException undefined)
        {   System.out.println("Error: Calculation is taking the root of a negative number. Result is undefined.");
            System.out.println("Please check the domain of your equation.");
            System.exit(0);    
        } 

        System.out.println("result is: " + result);
        changeString();

        return equation;
    }
}