package Day_17;

class solution_of_D17Q3
{
    public String truncateSentence(String s, int k)
    {
        int space = 0, i;
        for (i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
                space++;
            if(space==k)
                break;
        }
        return s.substring(0,i);
    }
}

public class Q3_Truncate_Sentence
{
    /*
        A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

        For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
        You are given a sentence s and an integer k. You want to truncate s such that it contains only the first k words. Return s after truncating it.


            Example 1:
                Input: s = "Hello how are you Contestant", k = 4
                Output: "Hello how are you"
                Explanation:
                The words in s are ["Hello", "how" "are", "you", "Contestant"].
                The first 4 words are ["Hello", "how", "are", "you"].
                Hence, you should return "Hello how are you".

            Example 2:
                Input: s = "What is the solution to this problem", k = 4
                Output: "What is the solution"
                Explanation:
                The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
                The first 4 words are ["What", "is", "the", "solution"].
                Hence, you should return "What is the solution".

            Example 3:
                Input: s = "chopper is not a tanuki", k = 5
                Output: "chopper is not a tanuki"
    */
    public static void main(String[] args)
    {
        solution_of_D17Q3 obj =new solution_of_D17Q3();
        String s = "What is the solution to this problem";
        int k = 4;
        System.out.println(obj.truncateSentence(s,k));
    }
}
