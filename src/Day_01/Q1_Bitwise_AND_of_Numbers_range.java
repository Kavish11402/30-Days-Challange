package Day_01;

class solution_of_D1Q1
{
    public int rangeBitwiseAnd(int left, int right)
    {
        int cnt = 0;
        while( left!=right )
        {
            left >>=1;
            right >>=1;
            cnt ++;
        }
        return left<<cnt;
    }
}

public class Q1_Bitwise_AND_of_Numbers_range
{

    /*
        TOPIC: Bit Manipulation

        Given two integers left and right that represent the range [left, right],
        return the bitwise AND of all numbers in this range, inclusive.

        Example 1:
            Input: left = 5, right = 7
            Operation: 5&6&7
            Output: 4

        Example 2:
            Input: left = 0, right = 0
            Operation: 0&0
            Output: 0

        Example 3:
            Input: left = 1, right = 2147483647
            Operation: 1&2&3&4&5&6&7&8&9&10&...
            Output: 0
    */

    public static void main(String[] args)
    {
        solution_of_D1Q1 obj = new solution_of_D1Q1();
        System.out.println(obj.rangeBitwiseAnd(5,7));
    }
}
