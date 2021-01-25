package FunctionWeaver;

public class Logarithm extends IntermediateOperations {   
    public Logarithm() {
        super();
    }

    public StringBuilder LogTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Logarithm";

        announce();
        
        partString();

        result = Math.log(value);

        System.out.println("result is: " + result);
        
        changeString();

        return equation;
    }
}