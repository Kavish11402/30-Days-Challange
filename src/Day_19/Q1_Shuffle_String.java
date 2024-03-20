package Day_19;


class solution_of_D19Q1
{
    public String restoreString(String s, int[] indices)
    {
        char[] arr=new char[s.length()];
        int i=0;
        for(char ch:s.toCharArray())
            arr[indices[i++]]=ch;

        StringBuilder sl=new StringBuilder();

        for(char ch:arr)
            sl.append(ch);

        return sl.toString();
    }
}

public class Q1_Shuffle_String
{
    /*
        You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character
        at the ith position moves to indices[i] in the shuffled string.

        Return the shuffled string.


            Example 1:
                Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
                Output: "leetcode"
                Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

            Example 2:
                Input: s = "abc", indices = [0,1,2]
                Output: "abc"
                Explanation: After shuffling, each character remains in its position.
    */
    public static void main(String[] args)
    {
        solution_of_D19Q1 obj = new solution_of_D19Q1();
        String str ="codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(obj.restoreString(str,arr));
    }
}
