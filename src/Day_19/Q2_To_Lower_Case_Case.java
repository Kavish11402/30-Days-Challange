package Day_19;

class solution_of_D19Q2
{
    public String toLowerCase(String s)
    {
        return s.toLowerCase();
    }
}

public class Q2_To_Lower_Case_Case
{
    /*
        Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.


            Example 1:
                Input: s = "Hello"
                Output: "hello"

            Example 2:
                Input: s = "here"
                Output: "here"

            Example 3:
                Input: s = "LOVELY"
                Output: "lovely"
    */
    public static void main(String[] args)
    {
        solution_of_D19Q2 obj = new solution_of_D19Q2();
        System.out.println(obj.toLowerCase("HELLO"));
    }
}
