package Day_16;

import java.util.ArrayList;
import java.util.List;

class solution_of_D16Q2
{
    public List<Integer> findWordsContaining(String[] words, char x)
    {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<words.length; i++)
        {
            for( int j=0; j< words[i].length(); j++ )
            {
                if(words[i].charAt(j)==x)
                {
                    res.add(i);
                    break;
                }
            }
        }

        return res;
    }
}

public class Q2_Find_Words_Containing_Character
{
    /*
        You are given a 0-indexed array of strings words and a character x.
        Return an array of indices representing the words that contain the character x.
        Note that the returned array may be in any order.


            Example 1:
                Input: words = ["leet","code"], x = "e"
                Output: [0,1]
                Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

            Example 2:
                Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
                Output: [0,2]
                Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.

            Example 3:
                Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
                Output: []
                Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
    */
    public static void main(String[] args)
    {
        solution_of_D16Q2 obj = new solution_of_D16Q2();
        String[] words = {"nhd","zheyegi","ogz","fpybmcc","ntbbwtde"};
        char x = 'g';
        System.out.println(obj.findWordsContaining(words,x));
    }
}
