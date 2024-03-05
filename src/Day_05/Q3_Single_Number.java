package Day_05;

import java.util.HashMap;
import java.util.Map;

class solution_of_D5Q3
{
    public int singleNumber(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int e : nums )
        {
            map.compute( e, (k,v)-> (v==null)?1:v+1 );
        }

        return map.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(-1);
    }
}

public class Q3_Single_Number
{
    /*
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.

            Example 1:
                Input: nums = [2,2,1]
                Output: 1

            Example 2:
                Input: nums = [4,1,2,1,2]
                Output: 4

            Example 3:
                Input: nums = [1]
                Output: 1
    */
    public static void main(String[] args)
    {
        solution_of_D5Q3 obj = new solution_of_D5Q3();
        //int[] arr = {2,2,1};
        int[] arr = {4,1,2,1,2};
        System.out.println(obj.singleNumber(arr));
    }
}
