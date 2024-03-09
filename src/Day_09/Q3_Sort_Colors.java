package Day_09;

import java.util.Arrays;

class solution_of_D9Q3
{
    public void sortColors(int[] nums)
    {
        int s=0;
        while (s<nums.length-1)
        {
            int e=s+1;
            while (e< nums.length)
            {
                if( nums[e]<nums[s] )
                {
                    nums[s]=nums[s]+nums[e];
                    nums[e]=nums[s]-nums[e];
                    nums[s]=nums[s]-nums[e];
                }
                e++;
            }
            s++;
        }
    }
}

public class Q3_Sort_Colors
{
    /*
        Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

        We will use integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

        You must solve this problem without using the library's sort function.

            Example 1:
                Input: nums = [2,0,2,1,1,0]
                Output: [0,0,1,1,2,2]

            Example 2:
                Input: nums = [2,0,1]
                Output: [0,1,2]
    */
    public static void main(String[] args)
    {
        solution_of_D9Q3 obj = new solution_of_D9Q3();
        int[] arr = {4};
        obj.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
