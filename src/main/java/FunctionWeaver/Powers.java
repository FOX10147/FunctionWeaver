package FunctionWeaver;

public class Powers extends IntermediateOperations {
    public Powers() {
        super();
    }
    
    public StringBuilder powerTest (StringBuilder equation) {
        this.equation = equation;
        this.operator = "Powers";
        announce();
        
        baseString();

        partString();

        result = Math.pow(base,value);

        System.out.println("result is: " + result);
        
        changeString();

        return equation;
    }

    public StringBuilder exponentTest (StringBuilder equation) {
        this.equation = equation;
        this.operator = "Powers";
        announce();

        partString();

        result = Math.exp(value);

        System.out.println("result is: " + result);
        
        changeString();

        return equation;
    }
}