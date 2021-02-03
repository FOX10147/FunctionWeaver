package FunctionWeaver;

import java.util.*;
import FunctionWeaver.Format.Formatter;

public class main {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);

        // Introduction
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Welcome to Function Weaver prototype.");
        System.out.println("This program is experimental and does not guarantee correct output on any calculation");
        System.out.println();
        System.out.println("Please proceed with caution");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Input a function (String) to test");
        
        // Get equation from user, then read it back.
        String Equation = sc.nextLine();
        StringBuilder equation = new StringBuilder().append(Equation);
        System.out.println();
        System.out.println("I'm reading " + Equation);

        // Look for variables and ask user to fill them in with values.
        Formatter formatter = new Formatter(equation);
        formatter.check(sc);

        // Start calculating and breaking down the string.
        ParenthesisEvaluator p_evaluator = new ParenthesisEvaluator();
        equation = p_evaluator.ParenthesisRecurse(equation);

        sc.close();
    }
}