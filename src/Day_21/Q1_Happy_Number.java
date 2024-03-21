package Day_21;

import java.util.ArrayList;

class solution_of_D21Q1
{
    public boolean isHappy(int n)
    {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 1)
        {
            while (n > 0)
            {
                sum = sum + ((n % 10)*(n % 10));
                n = n / 10;
            }
            n = sum;
            if (list.contains(n))
                break;
            list.add(n);
            sum = 0;
        }
        return n == 1;
    }
}

public class Q1_Happy_Number
{
    /*
        Write an algorithm to determine if a number n is happy.

        A happy number is a number defined by the following process:

        Starting with any positive integer, replace the number by the sum of the squares of its digits.
        Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
        Those numbers for which this process ends in 1 are happy.
        Return true if n is a happy number, and false if not.


            Example 1:
                Input: n = 19
                Output: true
                Explanation:
                    12 + 92 = 82
                    82 + 22 = 68
                    62 + 82 = 100
                    12 + 02 + 02 = 1

            Example 2:
                Input: n = 2
                Output: false
    */
    public static void main(String[] args)
    {
        solution_of_D21Q1 obj = new solution_of_D21Q1();
        System.out.println(obj.isHappy(12));
    }
}
