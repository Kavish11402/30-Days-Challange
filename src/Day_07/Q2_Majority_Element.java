package Day_07;

import java.util.Arrays;

class solution_of_D7Q2
{
    public int majorityElement(int[] nums)
    {
        Arrays.sort(nums);
        System.gc();
        int rep=0, value=nums[0], s=0, e=1;

        while (s<= nums.length-2)
        {
            int temp=0;
            while ( e< nums.length && (nums[e] == nums[s]) )
            {
                temp=temp+1;
                e++;
            }
            if( temp/2>rep )
            {
                rep=temp/2;
                value=nums[s];
            }
            s=e;

        }
        return value;
    }
}

public class Q2_Majority_Element
{
    /*
        Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

            Example 1:
                Input: nums = [3,2,3]
                Output: 3

            Example 2:
                Input: nums = [2,2,1,1,1,2,2]
                Output: 2
    */

    public static void main(String[] args)
    {
        solution_of_D7Q2 obj = new solution_of_D7Q2();
        //int[] arr = {3,2,3};
        //int[] arr = {6,5,5};
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(obj.majorityElement(arr));
    }
}
