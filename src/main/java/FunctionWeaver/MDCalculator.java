package FunctionWeaver;

public class MDCalculator {
    public MDCalculator() {}
    StringBuilder equation;
    String left;
    String right;
    int stringLength;
    int substringLStart;
    int substringLEnd;
    int substringRStart;
    int substringREnd;
    double firstValue;
    double secondValue;
    double resultValue;

    public StringBuilder multiply (StringBuilder equation) {
        System.out.println(equation + " class for multiplication evaluation is being reached");
        substringLStart = 0;
        substringREnd = equation.length();
        for (int i = 1; i < equation.length(); i++)
        {   if (equation.charAt(i) == '*')
            {   substringLEnd = i;
                substringRStart = i + 1;
                break;
            }

        }
        left = equation.substring(substringLStart, substringLEnd);
        right = equation.substring(substringRStart, substringREnd);
        firstValue = Double.parseDouble(left);
        secondValue = Double.parseDouble(right);
        resultValue = firstValue * secondValue;

        stringLength = equation.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append(new Double(resultValue).toString());
        System.out.println(equation.toString() + " leaving addition class");

        return equation;
    }

    public StringBuilder divide (StringBuilder equation) {
        System.out.println(equation + " class for division evaluation is being reached");
        
        substringLStart = 0;
        substringREnd = equation.length();
        for (int i = 1; i < equation.length(); i++)
        {   if (equation.charAt(i) == '/')
            {   substringLEnd = i;
                substringRStart = i + 1;
                break;
            }

        }
        left = equation.substring(substringLStart, substringLEnd);
        right = equation.substring(substringRStart, substringREnd);
        firstValue = Double.parseDouble(left);
        secondValue = Double.parseDouble(right);
        resultValue = firstValue / secondValue;

        stringLength = equation.length();
        for (int i = 0; i < stringLength; i++)
        equation.delete(0, 1);
        
        equation.append(new Double(resultValue).toString());
        System.out.println(equation.toString() + " leaving addition class");

        return equation;
    }
}
