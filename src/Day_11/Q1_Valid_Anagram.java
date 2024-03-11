package Day_11;

class solution_of_D11Q1
{
    public boolean isAnagram(String str1, String str2) {
        int[] freq = new int[26];
        for (int c : str1.toCharArray())
            freq[c - 'a']++; // increase the element value +1 at char (c-'A')th index

        for (int c : str2.toCharArray())
            freq[c - 'a']--; // decrease the element value -1 at char (c-'A')th index

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
}

public class Q1_Valid_Anagram
{
    /*
        Given two strings s and t, return true if t is an anagram of s, and false otherwise.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

            Example 1:
                Input: s = "anagram", t = "nagaram"
                Output: true

            Example 2:
                Input: s = "rat", t = "car"
                Output: false
    */
    public static void main(String[] args)
    {
        solution_of_D11Q1 obj = new solution_of_D11Q1();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(obj.isAnagram(s,t));
    }
}
