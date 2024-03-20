package Day_19;

class solution_of_D19Q3
{
    public boolean checkIfPangram(String sentence)
    {
        for(char c='a'; c<='z'; c++)
        {
            if( !sentence.contains(String.valueOf(c)) )
                return false;
        }
        return true;
    }
}

public class Q3_Check_If_The_Sentence_Is_Pangram
{
    /*
        A pangram is a sentence where every letter of the English alphabet appears at least once.
        Given a string sentence containing only lowercase English letters, return true if the sentence is a pangram, or false otherwise.


            Example 1:
                Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
                Output: true
                Explanation: sentence contains at least one of every letter of the English alphabet.

            Example 2:
                Input: sentence = "leetcode"
                Output: false
    */
    public static void main(String[] args)
    {
        solution_of_D19Q3 obj = new solution_of_D19Q3();
        System.out.println(obj.checkIfPangram("leetcode"));
    }
}
