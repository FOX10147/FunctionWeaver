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

    public StringBuilder cosTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        partString();
        result = Math.cos(value);
        changeString();

        return equation;
    }

    public StringBuilder tanTest(StringBuilder equation) {
        this.equation = equation;
        this.operator = "Trigonometry";

        partString();
        try
        {   result = Math.tan(value);   }
        catch (Exception undefined)
        {   System.out.println("Error: tangent reached undefined value");
            System.out.println("Please check the domain of your equation");
            System.exit(0);
        }
            changeString();

        return equation;
    }
}