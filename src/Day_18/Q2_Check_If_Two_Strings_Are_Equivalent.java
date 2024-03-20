package Day_18;

class solution_of_D18Q2
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();

        for(String word:word1)
            w1.append(word);

        for(String word:word2)
            w2.append(word);

        return w1.compareTo(w2) == 0;
    }
}

public class Q2_Check_If_Two_Strings_Are_Equivalent
{
    /*
        Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

        A string is represented by an array if the array elements concatenated in order forms the string.


            Example 1:
                Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
                Output: true
                Explanation:
                    word1 represents string "ab" + "c" -> "abc"
                    word2 represents string "a" + "bc" -> "abc"
                    The strings are the same, so return true.

            Example 2:
                Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
                Output: false

            Example 3:
                Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
                Output: true
    */
    public static void main(String[] args)
    {
        solution_of_D18Q2 obj = new solution_of_D18Q2();
        String[] w1 = {"ab", "c"};
        String[] w2 = {"a", "bc"};
        System.out.println(obj.arrayStringsAreEqual(w1,w2));
    }
}
