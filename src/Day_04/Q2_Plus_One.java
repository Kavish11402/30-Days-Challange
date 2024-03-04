package Day_04;
import java.util.Arrays;
import java.util.ArrayList;

class solution_of_D4Q2
{
    public int[] plusOne(int[] digits)
    {
        int carry=0;
        ArrayList<Integer> list = new ArrayList<>();

        if( (digits[digits.length-1]+1)/10 != 0 )
        {
            list.add( (digits[digits.length-1]+1)%10 );
            carry=(digits[digits.length-1]+1)/10;
        }
        else
            list.add( digits[digits.length-1]+1 );

        for (int i= (digits.length-2); i>=0; i--)
        {
            int add = digits[i]+carry;
            if ( add/10!=0 )
            {
                list.addFirst( add%10 );
                carry = add/10;
            }
            else
            {
                carry=0;
                list.addFirst(add);
            }
        }
        if(carry!=0)
            list.addFirst(carry);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Q2_Plus_One
{
    /*
        You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to the least significant in left-to-right order. The large integer does not contain any leading 0's.
        Increment the large integer by one and return the resulting array of digits.

            Example 1:
                Input: digits = [1,2,3]
                Output: [1,2,4]
                Explanation: The array represents the integer 123.
                Incrementing by one gives 123 + 1 = 124.
                Thus, the result should be [1,2,4].

            Example 2:
                Input: digits = [4,3,2,1]
                Output: [4,3,2,2]
                Explanation: The array represents the integer 4321.
                Incrementing by one gives 4321 + 1 = 4322.
                Thus, the result should be [4,3,2,2].

            Example 3:
                Input: digits = [9]
                Output: [1,0]
                Explanation: The array represents the integer 9.
                Incrementing by one gives 9 + 1 = 10.
                Thus, the result should be [1,0].
*/

    public static void main(String[] args)
    {
        solution_of_D4Q2 obj = new solution_of_D4Q2();
        int[] arr = {9,9};
        System.out.println("A=>"+Arrays.toString(obj.plusOne(arr)));
    }
}
