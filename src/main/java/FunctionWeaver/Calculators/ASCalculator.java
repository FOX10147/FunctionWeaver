package FunctionWeaver.Calculators;

public class ASCalculator extends BasicOperations {
    public ASCalculator() {
        super();
    }

    public StringBuilder add (StringBuilder equation) {
        this.equation = equation;
        this.operator = "Addition";
        this.symbol = '+';
        boolean hold = false;

        if (equation.charAt(0) == '-') hold = true;
        
        announce();
        assignStrings();
        calculateValues();
        changeString();

        if (equation.charAt(0) == '-') hold = false;
        if (hold) equation.insert(0, '+');

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
