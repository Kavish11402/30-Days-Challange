package Day_11;

import java.util.Arrays;

class solution_of_D11Q3
{
    public String longestCommonPrefix(String[] strs)
    {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}

public class Q3_Longest_Common_Prefix
{
    /*
        Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".

            Example 1:
                Input: strs = ["flower","flow","flight"]
                Output: "fl"

            Example 2:
                Input: strs = ["dog","racecar","car"]
                Output: ""
                Explanation: There is no common prefix amongst the input strings.
    */
    public static void main(String[] args)
    {
        solution_of_D11Q3 obj = new solution_of_D11Q3();
        String[] str = {"flower","flow","flight"};
        System.out.println(obj.longestCommonPrefix(str));
    }
}
