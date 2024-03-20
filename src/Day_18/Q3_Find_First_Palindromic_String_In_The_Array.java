package Day_18;


class solution_of_D18Q3
{
    public boolean isPalindrome(String str)
    {
        int s=0, e=str.length()-1;
        while (s<e)
        {
            if(str.charAt(s)!=str.charAt(e))
                return false;
            s++; e--;
        }
        return true;
    }
    public String firstPalindrome(String[] words)
    {
        for (String word : words) {
            if (isPalindrome(word))
                return word;
        }
        return "";
    }
}

public class Q3_Find_First_Palindromic_String_In_The_Array
{
    /*
        Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

        A string is palindromic if it reads the same forward and backward.


            Example 1:
                Input: words = ["abc","car","ada","racecar","cool"]
                Output: "ada"
                Explanation: The first string that is palindromic is "ada".
                Note that "racecar" is also palindromic, but it is not the first.

            Example 2:
                Input: words = ["notapalindrome","racecar"]
                Output: "racecar"
                Explanation: The first and only string that is palindromic is "racecar".

            Example 3:
                Input: words = ["def","ghi"]
                Output: ""
                Explanation: There are no palindromic strings, so the empty string is returned.
    */
    public static void main(String[] args)
    {
        solution_of_D18Q3 obj = new solution_of_D18Q3();
        String[] arr = {"abc","car","ada","racecar","cool"};
        System.out.println(obj.firstPalindrome(arr));
    }
}
