package Day_12;

class solution_of_D12Q2
{
    public boolean checkStrings( String s1, String s2 )
    {
            int i=0;
            while (i<s1.length())
            {
                if(s1.charAt(i)!=s2.charAt(i))
                    return false;
                i++;
            }
            return true;
    }
    public int strStr(String haystack, String needle)
    {
        int point=0, s=0, e=(needle.length()-1)-s;
        for (int i=0; i<=(haystack.length()-1)-(needle.length()-1); i++)
        {
            if( checkStrings( haystack.substring(i,((needle.length()-1)+i)+1 ),needle ) )
            {
                return i;
            }
        }
        return -1;
    }
}

public class Q2_Find_The_Index_Of_The_First_Occurrence_In_a_String
{
    /*
        Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if the needle is not part of haystack.

            Example 1:
                Input: haystack = "sadbutsad", needle = "sad"
                Output: 0
                Explanation: "sad" occurs at index 0 and 6.
                The first occurrence is at index 0, so we return 0.

            Example 2:
                Input: haystack = "leetcode", needle = "leeto"
                Output: -1
                Explanation: "leeto" did not occur in "leetcode", so we return -1.
    */
    public static void main(String[] args)
    {
        solution_of_D12Q2 obj = new solution_of_D12Q2();
        System.out.println(obj.strStr("6666666666666665","6"));
    }
}
