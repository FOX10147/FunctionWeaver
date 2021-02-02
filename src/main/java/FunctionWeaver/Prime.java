package FunctionWeaver;

interface Prime {
    public default int putMarker1(StringBuilder equation, int i, int substringStart) {
        for (int k = i - 1; k >= 0; k--)
        {   if (equation.charAt(k) == '0' || equation.charAt(k) == '1' || equation.charAt(k) == '2' ||
                equation.charAt(k) == '3' || equation.charAt(k) == '4' || equation.charAt(k) == '5' ||
                equation.charAt(k) == '6' || equation.charAt(k) == '7' || equation.charAt(k) == '8' ||
                equation.charAt(k) == '9' || equation.charAt(k) == '.' || equation.charAt(k) == 'x')
            {   substringStart = k;   }
            else break;
        }
        return substringStart;
    }

    public default int putMarker2(StringBuilder equation, int i, int substringEnd) {
        for (int k = i + 1; k < equation.length(); k++)
        {   if (equation.charAt(k) == '0' || equation.charAt(k) == '1' || equation.charAt(k) == '2' ||
                equation.charAt(k) == '3' || equation.charAt(k) == '4' || equation.charAt(k) == '5' ||
                equation.charAt(k) == '6' || equation.charAt(k) == '7' || equation.charAt(k) == '8' ||
                equation.charAt(k) == '9' || equation.charAt(k) == '.' || equation.charAt(k) == 'x' ||
                equation.charAt(k) == '-')
            {   substringEnd = k + 2;   }
            else break;
        }
        return substringEnd;
    }
}