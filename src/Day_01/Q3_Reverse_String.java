package Day_01;

class solution_of_D1Q3
{
    public void reverseString(char[] s)
    {
        int start=0, end=s.length-1;
        while ( start<end )
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}

public class Q3_Reverse_String
{

        /*
        TOPIC: Two Pointers & Strings

        Write a function that reverses a string. The input string is given as an array of characters s.
        You must do this by modifying the input array in-place with O(1) extra memory.

        Example 1:
            Input: s = ["h","e","l","l","o"]
            Output: ["o","l","l","e","h"]

        Example 2:
            Input: s = ["H","a","n","n","a","h"]
            Output: ["h","a","n","n","a","H"]
    */

    public static void main(String[] args)
    {
        solution_of_D1Q3 obj = new solution_of_D1Q3();
        char[] array = {'H','a','n','n','a','h'};
        obj.reverseString(array);
        /*System.out.println(Arrays.toString(array));*/
    }
}
