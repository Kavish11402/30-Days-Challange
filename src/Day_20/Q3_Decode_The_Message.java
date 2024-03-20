package Day_20;

import java.util.Arrays;
import java.util.HashMap;

class solution_of_D20Q3
{
    public String decodeMessage(String key, String message)
    {
        HashMap<Character, Character> map = new HashMap<>();
        int temp=0;
        for(int i=0 ; i<key.length(); i++)
        {
            if(key.charAt(i)==' '||map.containsKey(key.charAt(i))){
                temp++;
                continue;
            }
            map.put(key.charAt(i),(char)('a'+i-temp));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<message.length(); i++){
            if(message.charAt(i)==' '){
                sb.append(" ");
                continue;
            }
            char val = message.charAt(i);
            sb.append(map.get(val));
        }
        return sb.toString();
    }
}

public class Q3_Decode_The_Message
{
    /*
        You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

        Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
        Align the substitution table with the regular English alphabet.
        Each letter in message is then substituted using the table.
        Spaces ' ' are transformed to themselves.
        For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have
        the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
        Return the decoded message.


            Example 1:
                Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
                Output: "this is a secret"
                Explanation: The diagram above shows the substitution table.
                It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".

            Example 2:
                Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
                Output: "the five boxing wizards jump quickly"
                Explanation: The diagram above shows the substitution table.
                It is obtained by taking the first appearance of each letter in "eljuxhpwnyrdgtqkviszcfmabo".
    */
    public static void main(String[] args)
    {
        solution_of_D20Q3 obj = new solution_of_D20Q3();
        String msg = "vkbs bs t suepuv";
        String key = "the quick brown fox jumps over the lazy dog";
        System.out.println(obj.decodeMessage(key,msg));
    }
}
