package FunctionWeaver;

public class Roots extends IntermediateOperations {   
    public Roots() {
        super();
    }
    

    public StringBuilder SquareRootTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Roots";
        announce();
        
        partString();

        result = Math.sqrt(value);

        System.out.println("result is: " + result);
        
        changeString();

        return equation;
    }
}