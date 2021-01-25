package FunctionWeaver;

interface partialStrings {
    public default int weaveAnotherString (StringBuilder equation, int substringStart, int substringEnd, int i, char code) {
        int sl;
        int cl;
        StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
        sl = sub.length();
        
        if (code == '^')
        {   Powers powers = new Powers();
            powers.powerTest(sub);
        }
        else if (code == '*')
        {   MDCalculator md_calculator = new MDCalculator();
            md_calculator.multiply(sub);
        }
        else if (code == '/')
        {   MDCalculator md_calculator = new MDCalculator();
            md_calculator.divide(sub);
        }
        else if (code == '+')
        {   ASCalculator as_calculator = new ASCalculator();
            as_calculator.add(sub);
        }
        else if (code == '-')
        {   ASCalculator as_calculator = new ASCalculator();
            as_calculator.subtract(sub);
        }
        if (code == 'E')
        {   Powers expPower = new Powers();
            expPower.exponentTest(sub);
        }
        else if (code == 'L')
        {   Logarithm logarithm = new Logarithm();
            logarithm.LogTest(sub);
        }
        else if (code == 'P')
        {   ParenthesisEvaluator evaluator = new ParenthesisEvaluator();
            evaluator.ParenthesisRecurse(sub);
        }
        else if (code == 'R')
        {   Roots roots = new Roots();
            roots.SquareRootTest(sub);
        }
        else if (code == 'T')
        {   Trigonometry trig = new Trigonometry();
            trig.sinTest(sub);
        }
        
        cl = sub.length();
        System.out.println("new substring: " + sub);
        equation.delete(substringStart, substringEnd);
        equation.insert(substringStart, sub);
        System.out.println("current equation is: " + equation);
        i -= sl - cl;

        return i;
    }
}
