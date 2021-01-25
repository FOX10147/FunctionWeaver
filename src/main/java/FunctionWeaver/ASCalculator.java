package FunctionWeaver;

public class ASCalculator extends BasicOperations {
    public ASCalculator() {
        super();
    }

    public StringBuilder add (StringBuilder equation) {
        this.equation = equation;
        this.operator = "Addition";
        this.symbol = '+';
        announce();

        assignStrings();

        calculateValues();
        
        changeString();

        return equation;
    }

    public StringBuilder subtract (StringBuilder equation) {
        this.equation = equation;
        this.operator = "Subtraction";
        this.symbol = '-';
        announce();

        assignStrings();
        
        calculateValues();
        
        changeString();

        return equation;
    }
}
