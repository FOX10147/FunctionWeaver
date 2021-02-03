package FunctionWeaver.Calculators;

public class MDCalculator extends BasicOperations {
    public MDCalculator() {
        super();
    }

    public StringBuilder multiply (StringBuilder equation) {
        this.equation = equation;
        this.operator = "Multiplication";
        this.symbol = '*';

        announce();
        assignStrings();
        calculateValues();
        changeString();

        return equation;
    }

    public StringBuilder divide (StringBuilder equation) {
        this.equation = equation;
        this.operator = "Division";
        this.symbol = '/';

        announce();
        assignStrings();
        calculateValues();
        changeString();

        return equation;
    }
}
