package Day_07;

import java.util.HashMap;

class solution_of_D7Q1
{
    public boolean containsDuplicate(int[] nums)
    {
        HashMap<Integer,Integer> table = new HashMap<>();
        for(int e : nums)
        {
            table.compute( e , (key,value)-> (value==null)?1:value+1 );
            if( table.get(e)>1 )
                return true;
        }
        return false;
    }
}

public class Q1_Contains_Duplicate
{
    /*
        Given an integer array nums, return true if any value appears at least twice in the array, and
        return false if every element is distinct.

            Example 1:
                Input: nums = [1,2,3,1]
                Output: true

            Example 2:
                Input: nums = [1,2,3,4]
                Output: false

            Example 3:
                Input: nums = [1,1,1,3,3,4,3,2,4,2]
                Output: true
    */
    public static void main(String[] args)
    {
        solution_of_D7Q1 obj = new solution_of_D7Q1();
        //int[] arr = {1,2,3,1};
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(obj.containsDuplicate(arr));
    }
}
