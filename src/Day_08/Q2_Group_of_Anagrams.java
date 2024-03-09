package Day_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class solution_of_D8Q2
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}

public class Q2_Group_of_Anagrams
{
    /*
        Given an array of strings strs, group the anagrams together. You can return the answer in any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

            Example 1:
                Input: strs = ["eat","tea","tan","ate","nat","bat"]
                Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

            Example 2:
                Input: strs = [""]
                Output: [[""]]

            Example 3:
                Input: strs = ["a"]
                Output: [["a"]]
    */
    public static void main(String[] args)
    {
        solution_of_D8Q2 obj = new solution_of_D8Q2();
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj.groupAnagrams(arr));
    }
}
