package Day_05;

import java.util.Arrays;

class solution_of_D5Q2
{
    public void moveZeroes(int[] nums)
    {
        System.out.println( "Start => " + Arrays.toString(nums));

        int s=0, e=1;
        while ( e< nums.length )
        {
            if( nums[s]==0 )
            {
                if( nums[e]!=0 )
                {
                    int temp = nums[s];
                    nums[s] = nums[e];
                    nums[e] = temp;
                    s++;
                }
            }
            else
                s++;
            e++;
        }



        System.out.println( "Program Finished Processing => " + Arrays.toString(nums));
    }
}

public class Q2_Move_Zeros
{
    /*
        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        Note that you must do this in-place without making a copy of the array.

            Example 1:
                Input: nums = [0,1,0,3,12]
                Output: [1,3,12,0,0]

            Example 2:
                Input: nums = [0]
                Output: [0]
    */
    public static void main(String[] args)
    {
        solution_of_D5Q2 obj = new solution_of_D5Q2();
        int[] arr = {0,1,0,3,12,5,0,45,765,6757,0,3,0,2,3,0,0,5};
        obj.moveZeroes(arr);
    }
}
