package FunctionWeaver;

public class MDEvaluator {
    
    public StringBuilder Crunch(StringBuilder equation) {
        int substringStart = 0;
        int substringEnd = 0;
        boolean M = true;
        boolean flag;

        do
        {   flag = false;
            substringStart = 0;
            for (int i = 0; i < equation.length(); i++)
            {   if (equation.charAt(i) == '0' || equation.charAt(i) == '1' || equation.charAt(i) == '2' ||
                    equation.charAt(i) == '3' || equation.charAt(i) == '4' || equation.charAt(i) == '5' ||
                    equation.charAt(i) == '6' || equation.charAt(i) == '7' || equation.charAt(i) == '8' ||
                    equation.charAt(i) == '9' || equation.charAt(i) == '.' || equation.charAt(i) == 'x')
                {   substringEnd = i + 1;   }
                else if (equation.charAt(i) == '+' || equation.charAt(i) == '-')
                {   substringStart = i + 1; }
                else if (equation.charAt(i) == '*' || equation.charAt(i) == '/')
                {   if (equation.charAt(i) == '*') M = true;
                    else if (equation.charAt(i) == '/') M = false;

                    for (int j = i + 1; j < equation.length(); j++)
                    {   if (equation.charAt(j) == '0' || equation.charAt(j) == '1' || equation.charAt(j) == '2' ||
                            equation.charAt(j) == '3' || equation.charAt(j) == '4' || equation.charAt(j) == '5' ||
                            equation.charAt(j) == '6' || equation.charAt(j) == '7' || equation.charAt(j) == '8' ||
                            equation.charAt(j) == '9' || equation.charAt(j) == '.' || equation.charAt(j) == 'x')
                        {   substringEnd = j + 1;   }
                        else break;
                    }
                    StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                    StringBuilder comparison = new StringBuilder();
                    MDCalculator md_calculator = new MDCalculator();
                    if (M == true)
                    {   comparison = md_calculator.multiply(sub);   }
                    else if (M == false)
                    {   comparison = md_calculator.divide(sub); }
                    System.out.println("original substring: " + sub + " --> new substring: " + comparison);
                    equation.delete(substringStart, substringEnd);
                    equation.insert(substringStart, comparison);
                    System.out.println(equation);
                    flag = true;
                    break;
                }
                else break;
            }
        } while(flag);

        return equation;
    }
}