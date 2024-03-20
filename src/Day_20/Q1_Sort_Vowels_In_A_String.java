package Day_20;


import java.util.HashMap;

class solution_of_D20Q1
{
    boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }

    public String sortVowels(String str)
    {
        HashMap<Character,Integer> table = new HashMap<>();
        for(char c:str.toCharArray())
        {
            if(isVowel(c))
                table.compute(c,(k,v)->(v==null)?1:v+1);
        }

        StringBuilder sortedStr = new StringBuilder();
        String order = "AEIOUaeiou";
        int idx=0;

        for(int i=0; i<str.length(); i++)
        {
            if(isVowel(str.charAt(i)))
            {
                while( !table.containsKey(order.charAt(idx)) )
                    idx++;

                sortedStr.append(order.charAt(idx));
                table.compute(order.charAt(idx),(k,v)->v-1);
                if(table.get(order.charAt(idx))<=0)
                    table.remove(order.charAt(idx));
            }
            else
            {
                sortedStr.append(str.charAt(i));
            }
        }
        return sortedStr.toString();
    }
}

public class Q1_Sort_Vowels_In_A_String
{
    /*
        Given a 0-indexed string s, permute s to get a new string t such that:

        All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length such that s[i] is a consonant, then
        t[i] = s[i].
        The vowels must be sorted in the non-decreasing order of their ASCII values. More formally, for pairs of indices i, j with 0 <= i < j < s.length
        such that s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value than t[j].
        Return the resulting string.

        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.


            Example 1:
                Input: s = "lEetcOde"
                Output: "lEOtcede"
                Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants.
                The vowels are sorted according to their ASCII values, and the consonants remain in the same places.

            Example 2:
                Input: s = "lYmpH"
                Output: "lYmpH"
                Explanation: There are no vowels in s (all characters in s are consonants), so we return "lYmpH".
    */
    public static void main(String[] args)
    {
        solution_of_D20Q1 obj = new solution_of_D20Q1();
        String s = "lYmpH";
        System.out.println(obj.sortVowels(s));
    }
}
