package FunctionWeaver;

public class ParenthesisEvaluator {
    private boolean flag = false;

    public StringBuilder ParenthesisRecurse(StringBuilder equation) 
    {   System.out.println(equation);
        int count = 0;
        int substringStart = 0;
        int substringEnd = 0;
        int sl;
        int cl;
        int j = equation.length();
        for (int i = 0; i < j; i++) {
            if (equation.charAt(i) == '(') 
            {   count++;
                if (count == 1) 
                {   substringStart = i + 1;
                }
            }
            else if (equation.charAt(i) == ')') 
            {   count--;
                if (count == 0) 
                {   StringBuilder sub = new StringBuilder(equation.substring(substringStart, i));
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
            for (int i = 0; i < j; i++) 
            {   if (equation.charAt(i) == 'e') 
                {   if (equation.charAt(i+1) == '^') 
                    {   substringStart = i;
                        substringEnd = i+2;
                        for(int k = i + 2; k < j; k++)
                        {   if (equation.charAt(k) == ')')
                            {   substringEnd++; break;  }
                            else substringEnd++;
                        }
                        StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                        StringBuilder comparison = new StringBuilder();
                        Powers expPower = new Powers();
                        sl = sub.length();
                        comparison = expPower.exponentTest(sub);
                        cl = comparison.length();
                        System.out.println("original pow substring: " + sub + " --> new pow substring: " + comparison);
                        equation.delete(substringStart, substringEnd);
                        equation.insert(substringStart, comparison);
                        System.out.println(equation);
                        i -= sl - cl;
                        flag = true;
                        break;
                    }
                }
                
                if (equation.charAt(i) == '^') 
                {   for (int k = i - 1; k >= 0; k--)
                    {   if (equation.charAt(k) == '0' || equation.charAt(k) == '1' || equation.charAt(k) == '2' ||
                            equation.charAt(k) == '3' || equation.charAt(k) == '4' || equation.charAt(k) == '5' ||
                            equation.charAt(k) == '6' || equation.charAt(k) == '7' || equation.charAt(k) == '8' ||
                            equation.charAt(k) == '9' || equation.charAt(k) == '.' || equation.charAt(k) == 'x')
                        {   substringStart = k;   }
                        else break;
                    }

                    for (int k = i + 2; k < equation.length(); k++)
                    {   if (equation.charAt(k) == '0' || equation.charAt(k) == '1' || equation.charAt(k) == '2' ||
                            equation.charAt(k) == '3' || equation.charAt(k) == '4' || equation.charAt(k) == '5' ||
                            equation.charAt(k) == '6' || equation.charAt(k) == '7' || equation.charAt(k) == '8' ||
                            equation.charAt(k) == '9' || equation.charAt(k) == '.' || equation.charAt(k) == 'x')
                        {   substringEnd = k + 2;   }
                        else break;
                    }
                    
                    StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                    StringBuilder comparison = new StringBuilder();
                    Powers powers = new Powers();
                    sl = sub.length();
                    comparison = powers.powerTest(sub);
                    cl = comparison.length();
                    System.out.println("original substring: " + sub + " --> new substring: " + comparison);
                    equation.delete(substringStart, substringEnd);
                    equation.insert(substringStart, comparison);
                    System.out.println(equation);
                    i -= sl - cl;
                    flag = true;
                    break;
                }
            
                if (equation.charAt(i) == 's') 
                {   if (equation.charAt(i+1) == 'i') 
                    {   if (equation.charAt(i+2) == 'n') 
                        {  substringStart = i;
                            for(int k = i + 4; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;  }
                            StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                            StringBuilder comparison = new StringBuilder();
                            Trigonometry trig = new Trigonometry();
                            sl = sub.length();
                            comparison = trig.sinTest(sub);
                            cl = comparison.length();
                            System.out.println("original pow substring: " + sub + " --> new pow substring: " + comparison);
                            equation.delete(substringStart, substringEnd);
                            equation.insert(substringStart, comparison);
                            System.out.println(equation);
                            i -= sl - cl;
                            flag = true;
                            break;
                        }
                    }
                    else if (equation.charAt(i+1) == 'q') 
                    {   if (equation.charAt(i+2) == 'r') 
                        {   if (equation.charAt(i+3) == 't') 
                            {   substringStart = i;
                                for(int k = i + 5; k < j; k++)
                                    if (equation.charAt(k) == ')')
                                    {   substringEnd = k + 1; break;  }
                                StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                                StringBuilder comparison = new StringBuilder();
                                Roots roots = new Roots();
                                sl = sub.length();
                                comparison = roots.SquareRootTest(sub);
                                cl = comparison.length();
                                System.out.println("original pow substring: " + sub + " --> new pow substring: " + comparison);
                                equation.delete(substringStart, substringEnd);
                                equation.insert(substringStart, comparison);
                                System.out.println(equation);
                                i -= sl - cl;
                                flag = true;
                                break;
                            }
                        }
                    }
                }

                if (equation.charAt(i) == 'l') 
                {   if (equation.charAt(i+1) == 'o') 
                    {   if (equation.charAt(i+2) == 'g') 
                        {   substringStart = i;
                            for(int k = i + 3; k < j; k++)
                                if (equation.charAt(k) == ')')
                                {   substringEnd = k + 1; break;  }
                            StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                            StringBuilder comparison = new StringBuilder();
                            Logarithm logarithm = new Logarithm();
                            sl = sub.length();
                            comparison = logarithm.LogTest(sub);
                            cl = comparison.length();
                            System.out.println("original pow substring: " + sub + " --> new pow substring: " + comparison);
                            equation.delete(substringStart, substringEnd);
                            equation.insert(substringStart, comparison);
                            System.out.println(equation);
                            i -= sl - cl;
                            flag = true;
                            break;
                        }
                    }
                }
            }
        }
        while (flag);

        do 
        {   flag = false;
            for (int i = 0; i < equation.length(); i++)
            {   if (equation.charAt(i) == '(' || equation.charAt(i) == ')')
                {   equation.delete(i, i + 1);
                    flag = true;
                    break;
                }
            }
        }   
        while(flag);

        do
        {   flag = false;
            substringStart = 0;
            substringEnd = 0;
            j = equation.length();
            for (int i = 0; i < j; i++)
            {   if (equation.charAt(i) == '*' || equation.charAt(i) == '/')
                {   for (int k = i - 1; k >= 0; k--)
                    if (equation.charAt(k) == '0' || equation.charAt(k) == '1' || equation.charAt(k) == '2' ||
                        equation.charAt(k) == '3' || equation.charAt(k) == '4' || equation.charAt(k) == '5' ||
                        equation.charAt(k) == '6' || equation.charAt(k) == '7' || equation.charAt(k) == '8' ||
                        equation.charAt(k) == '9' || equation.charAt(k) == '.' || equation.charAt(k) == 'x')
                        {   substringStart = k;   }
                    else break;

                    for (int k = i + 1; k < equation.length(); k++)
                    if (equation.charAt(k) == '0' || equation.charAt(k) == '1' || equation.charAt(k) == '2' ||
                        equation.charAt(k) == '3' || equation.charAt(k) == '4' || equation.charAt(k) == '5' ||
                        equation.charAt(k) == '6' || equation.charAt(k) == '7' || equation.charAt(k) == '8' ||
                        equation.charAt(k) == '9' || equation.charAt(k) == '.' || equation.charAt(k) == 'x')
                        {   substringEnd = k + 1;   }
                    else break;

                    StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                    StringBuilder comparison = new StringBuilder();
                    MDEvaluator md_evaluator = new MDEvaluator();
                    sl = sub.length();
                    comparison = md_evaluator.Crunch(sub);
                    cl = comparison.length();
                    System.out.println("original substring: " + sub + " --> new substring: " + comparison);
                    equation.delete(substringStart, substringEnd);
                    equation.insert(substringStart, comparison);
                    System.out.println(equation);
                    i -= sl - cl;
                    flag = true;
                    break;
                }
            }
        }
        while (flag);

        do
        {   flag = false;
            substringStart = 0;
            substringEnd = 0;
            j = equation.length();
            for (int i = 1; i < j; i++)
            {   if (equation.charAt(i) == '+' || equation.charAt(i) == '-')
                {   for (int k = i - 1; k >= 0; k--)
                        if (equation.charAt(k) == '0' || equation.charAt(k) == '1' || equation.charAt(k) == '2' ||
                            equation.charAt(k) == '3' || equation.charAt(k) == '4' || equation.charAt(k) == '5' ||
                            equation.charAt(k) == '6' || equation.charAt(k) == '7' || equation.charAt(k) == '8' ||
                            equation.charAt(k) == '9' || equation.charAt(k) == '.' || equation.charAt(k) == 'x')
                            {   substringStart = k;   }
                        else break;

                    for (int k = i + 1; k < equation.length(); k++)
                        if (equation.charAt(k) == '0' || equation.charAt(k) == '1' || equation.charAt(k) == '2' ||
                            equation.charAt(k) == '3' || equation.charAt(k) == '4' || equation.charAt(k) == '5' ||
                            equation.charAt(k) == '6' || equation.charAt(k) == '7' || equation.charAt(k) == '8' ||
                            equation.charAt(k) == '9' || equation.charAt(k) == '.' || equation.charAt(k) == 'x')
                            {   substringEnd = k + 1;   }
                        else break;

                        StringBuilder sub = new StringBuilder(equation.substring(substringStart, substringEnd));
                        StringBuilder comparison = new StringBuilder();
                        ASEvaluator as_evaluator = new ASEvaluator();
                        sl = sub.length();
                        comparison = as_evaluator.lastCrunch(sub);
                        cl = comparison.length();
                        System.out.println("original substring: " + sub + " --> new substring: " + comparison);
                        equation.delete(substringStart, substringEnd);
                        equation.insert(substringStart, comparison);
                        System.out.println(equation);
                        i -= sl - cl;
                        flag = true;
                        break;
                    }
            }
        }
        while(flag);
        
        System.out.println(equation);

        return equation;
    }
}