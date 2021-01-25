package FunctionWeaver;

import java.util.*;

public class main {
    public static void main(String[] args )
    {   Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Welcome to Function Weaver prototype.");
        System.out.println("This program is experimental and does not guarantee correct output on any calculation");
        System.out.println();
        System.out.println("Please proceed with caution");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Input a function (String) to test");
        
        String Equation = sc.nextLine();
        StringBuilder equation = new StringBuilder().append(Equation);
        System.out.println();
        System.out.println("I'm reading " + Equation);

        ParenthesisEvaluator p_evaluator = new ParenthesisEvaluator();
        // ExponentEvaluator e_evaluator = new ExponentEvaluator();
        MDEvaluator md_evaluator = new MDEvaluator();
        ASEvaluator as_evaluator = new ASEvaluator();
        equation = p_evaluator.ParenthesisRecurse(equation);
        // equation = e_evaluator.exponentCrunch(equation);
        equation = md_evaluator.Crunch(equation);
        equation = as_evaluator.lastCrunch(equation);

        sc.close();
    }
}