package Day_12;
import java.util.HashMap;

class solution_of_D12Q1
{
    public int firstUniqChar(String s)
    {
        HashMap<Character,Integer> table = new HashMap<>();
        for (int i=0; i<s.length(); i++)
            table.compute(s.charAt(i),(k,v)->(v==null)?0:v+1);

        for(char c:s.toCharArray())
        {
            if( table.get( c )==0 )
                return s.indexOf(c);
        }
        return -1;
    }
}

public class Q1_First_Unique_Character_In_String
{
    /*
        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

            Example 1:
                Input: s = "leetcode"
                Output: 0

            Example 2:
                Input: s = "loveleetcode"
                Output: 2

            Example 3:
                Input: s = "aabb"
                Output: -1
    */
    public static void main(String[] args)
    {
        solution_of_D12Q1 obj = new solution_of_D12Q1();
        System.out.println(obj.firstUniqChar("aabby"));
    }
}
