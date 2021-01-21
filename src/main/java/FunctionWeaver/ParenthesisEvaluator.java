package FunctionWeaver;

public class ParenthesisEvaluator {
    private boolean flag = false;

    public StringBuilder ParenthesisRecurse(StringBuilder equation) 
    {   System.out.println(equation);
        int count = 0;
        int substringStart = 0;
        int substringEnd = 0;
        int j = equation.length();
        for (int i = 0; i < j; i++) {
            if (equation.charAt(i) == '(') {
                count++;
                if (count == 1) {
                    substringStart = i + 1;
                }
            }
            else if (equation.charAt(i) == ')') {
                count--;
                if (count == 0) {
                    StringBuilder sub = new StringBuilder(equation.substring(substringStart, i));
                    StringBuilder comparison = new StringBuilder();
                    ParenthesisEvaluator Evaluator = new ParenthesisEvaluator();
                    comparison = Evaluator.ParenthesisRecurse(sub);
                    System.out.println("original substring: " + sub + " --> new substring: " + comparison);
                    equation.delete(substringStart, i);
                    equation.insert(substringStart, comparison);
                    System.out.println(equation);
                    i -= sub.length() - comparison.length();
                    j = equation.length();
                }
            }
        }
        
        do 
        {   flag = false;
            substringStart = 0;
            substringEnd = 0;
            j = equation.length();
            for (int i = 0; i < j; i++) {
                if (equation.charAt(i) == 'e') {
                    if (equation.charAt(i+1) == '^') {
                        substringStart = i;
                        substringEnd = i+2;
                        for(int k = i + 2; k < j; k++)
                        {   if (equation.charAt(k) == ')')
                            {   substringEnd++; break;  }
                            else substringEnd++;
                        }
                        StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                        StringBuilder comparison = new StringBuilder();
                        Powers expPower = new Powers();
                        comparison = expPower.TestForFuture2(sub);
                        System.out.println("original pow substring: " + sub + " --> new pow substring: " + comparison);
                        equation.delete(substringStart, substringEnd);
                        equation.insert(substringStart, comparison);
                        System.out.println(equation);
                        i -= sub.length() - comparison.length();
                        flag = true;
                        break;
                    }
                }
                
                if (equation.charAt(i) == '^') {
                    Powers powers = new Powers();
                    powers.TestForFuture(equation);
                }
            
                if (equation.charAt(i) == 's') {
                    if (equation.charAt(i+1) == 'i') {
                        if (equation.charAt(i+2) == 'n') {
                            StringBuilder equation_2 = new StringBuilder().append(equation);
                            Trigonometry trig = new Trigonometry(equation_2);
                            equation_2 = trig.sinTest(equation_2);
                            equation = equation_2;
                            flag = true;
                            break;
                        }
                    }
                    else if (equation.charAt(i+1) == 'q') {
                        if (equation.charAt(i+2) == 'r') {
                            if (equation.charAt(i+3) == 't') {
                                substringStart = i;
                                substringEnd = i + 4;
                                for(int k = i + 4; k < j; k++)
                                {   if (equation.charAt(k) == ')')
                                    {   substringEnd++; break;  }
                                    else substringEnd++;
                                }
                                StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                                StringBuilder comparison = new StringBuilder();
                                Roots roots = new Roots();
                                comparison = roots.TestForFuture(sub);
                                System.out.println("original root substring: " + sub + " --> new root substring: " + comparison);
                                equation.delete(substringStart, substringEnd);
                                equation.insert(substringStart, comparison);
                                System.out.println(equation);
                                i -= sub.length() - comparison.length();
                                flag = true;
                                break;
                                }
                        }
                    }
                }

                if (equation.charAt(i) == 'l') {
                    if (equation.charAt(i+1) == 'o') {
                        if (equation.charAt(i+2) == 'g') {
                            substringStart = i;
                            substringEnd = i + 3;
                            for(int k = i + 3; k < j; k++)
                            {   if (equation.charAt(k) == ')')
                                {   substringEnd++; break;  }
                                else substringEnd++;
                            }
                            StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                            StringBuilder comparison = new StringBuilder();
                            Logarithm logarithm = new Logarithm();
                            comparison = logarithm.TestForFuture(sub);
                            System.out.println("original pow substring: " + sub + " --> new pow substring: " + comparison);
                            equation.delete(substringStart, substringEnd);
                            equation.insert(substringStart, comparison);
                            System.out.println(equation);
                            i -= sub.length() - comparison.length();
                            flag = true;
                            break;
                        }
                    }
                }
            }
        } while(flag);

        do 
        {   flag = false;
            for (int i = 0; i < equation.length(); i++)
            {   if (equation.charAt(i) == '(' || equation.charAt(i) == ')')
                {   equation.delete(i, i + 1);
                    flag = true;
                    break;
                }
            }
        }   while(flag);
        
        System.out.println(equation);

        return equation;
    }
}