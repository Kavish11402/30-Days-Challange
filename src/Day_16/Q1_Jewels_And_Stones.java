package Day_16;

import java.util.HashMap;

class solution_of_D16Q1
{
    public int numJewelsInStones(String jewels, String stones)
    {
        int sum=0;
        HashMap<Character,Integer> table = new HashMap<>();

        for( char stone : stones.toCharArray() )
            table.compute(stone,(k,v)->(v==null)?1:++v);

        for( char j : jewels.toCharArray() )
        {
            if(table.containsKey(j))
                sum = sum + table.get(j);
        }

        return sum;
    }
}

public class Q1_Jewels_And_Stones
{
    /*
        You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
        Letters are case-sensitive, so "a" is considered a different type of stone from "A".


            Example 1:
                Input: jewels = "aA", stones = "aAAbbbb"
                Output: 3

            Example 2:
                Input: jewels = "z", stones = "ZZ"
                Output: 0
    */
    public static void main(String[] args)
    {
        solution_of_D16Q1 obj = new solution_of_D16Q1();
        System.out.println(obj.numJewelsInStones("z","ZZ"));
    }
}
