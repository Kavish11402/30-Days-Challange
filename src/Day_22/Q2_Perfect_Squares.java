package Day_22;

import java.util.Arrays;

class solution_of_D22Q2
{
    public int numSquares(int n)
    {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}

public class Q2_Perfect_Squares
{
    /*
        Given an integer n, return the least number of perfect square numbers that sum to n.

        A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
        For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.


            Example 1:
                Input: n = 12
                Output: 3
                Explanation: 12 = 4 + 4 + 4.

            Example 2:
                Input: n = 13
                Output: 2
                Explanation: 13 = 4 + 9.
    */
    public static void main(String[] args)
    {
        solution_of_D22Q2 obj = new solution_of_D22Q2();
        System.out.println(obj.numSquares(10));
    }
}
