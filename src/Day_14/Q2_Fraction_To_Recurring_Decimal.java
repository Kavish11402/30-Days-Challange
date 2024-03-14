package Day_14;

import java.util.HashMap;
import java.util.Map;

class solution_of_D14Q2
{
    public String fractionToDecimal(int numerator, int denominator)
    {
        StringBuilder ans = new StringBuilder();
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0))
            ans.append("-");

        long num = (long) Math.abs((long) numerator);
        long den = (long) Math.abs((long) denominator);

        long quotient = num / den;
        long remainder = num % den;

        ans.append(String.valueOf(quotient));

        if (remainder == 0)
            return ans.toString();

        ans.append(".");

        Map<Long, Integer> map = new HashMap<>();

        while (remainder != 0)
        {
            if (map.containsKey(remainder))
            {
                int pos = map.get(remainder);
                ans.insert(pos, "(");
                ans.append(")");
                return ans.toString();
            }
            else
            {
                map.put(remainder, ans.length());
                remainder *= 10;
                quotient = remainder / den;
                remainder %= den;
                ans.append(String.valueOf(quotient));
            }
        }

        return ans.toString();

    }
}

public class Q2_Fraction_To_Recurring_Decimal
{
    /*
        Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

        If the fractional part is repeating, enclose the repeating part in parentheses.

        If multiple answers are possible, return any of them.

        It is guaranteed that the length of the answer string is less than 104 for all the given inputs.


            Example 1:
                Input: numerator = 1, denominator = 2
                Output: "0.5"

            Example 2:
                Input: numerator = 2, denominator = 1
                Output: "2"

            Example 3:
                Input: numerator = 4, denominator = 333
                Output: "0.(012)"
    */
    public static void main(String[] args)
    {
        solution_of_D14Q2 obj = new solution_of_D14Q2();
        System.out.println(obj.fractionToDecimal(4,66));
    }
}
