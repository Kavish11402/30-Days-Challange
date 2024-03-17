package Day_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution_of_D17Q2
{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
    {
        int count = 0;
        int index = 0;

        if(ruleKey.equals("color"))
            index=1;
        else if(ruleKey.equals("name"))
            index=2;


        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue))
                count++;
        }

        return count;
    }
}

public class Q2_Count_Items_Matching_A_Rule
{
    /*
        You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
        You are also given a rule represented by two strings, ruleKey and ruleValue.

        The ith item is said to match the rule if one of the following is true:
            • ruleKey == "type" and ruleValue == typei.
            • ruleKey == "color" and ruleValue == colori.
            • ruleKey == "name" and ruleValue == namei.

        Return the number of items that match the given rule.


            Example 1:
                Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
                Output: 1
                Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

            Example 2:
                Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
                Output: 2
                Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"].
                Note that the item ["computer","silver","phone"] does not match.
    */
    public static void main(String[] args)
    {
        solution_of_D17Q2 obj = new solution_of_D17Q2();
        String ruleKey = "type", ruleValue = "phone";
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList(new String[]{"phone","blue","pixel"}));
        items.add(Arrays.asList(new String[]{"computer","silver","phone"}));
        items.add(Arrays.asList(new String[]{"phone","gold","iphone"}));

        System.out.println(obj.countMatches(items,ruleKey,ruleValue));

    }
}
