package FunctionWeaver;

public class Trigonometry extends IntermediateOperations {  
    public Trigonometry() {
        super();
    } 

    public Trigonometry (StringBuilder equation) {
        this.equation = equation;
    }

    public StringBuilder sinTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        partString();
        result = Math.sin(value);
        changeString();

        return equation;
    }
}