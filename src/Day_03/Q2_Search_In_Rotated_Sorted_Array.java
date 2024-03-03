package Day_03;

import java.util.Arrays;

class solution_of_D3Q2
{
    public int search(int[] nums, int target)
    {
        int pivot=0, result = -1;


        if( nums.length==1 )
        {
            if(nums[0]==target)
                result=0;
        }
        else
        {
            //For finding pivot
            for(int i=1; i< nums.length; i++)
            {
                if(nums[i-1]>nums[i])
                { pivot=i; break; }
            }

            if(target==nums[pivot])
                result = pivot;

            else if(pivot==0) {
                result=Arrays.binarySearch(Arrays.copyOfRange(nums, pivot + 1, nums.length), target);
                if(result > -1)
                    result = pivot+result+1;
            }


            else if(pivot== nums.length-1)
                result = Arrays.binarySearch( Arrays.copyOfRange( nums, 0, pivot ), target);

            else
            {
                if ( target>=nums[0] && target<=nums[pivot-1] )
                    result = Arrays.binarySearch( Arrays.copyOfRange( nums, 0, pivot ), target);

                else if ( target>=nums[pivot+1] && target<=nums[nums.length-1] )
                {
                    result=Arrays.binarySearch(Arrays.copyOfRange(nums, pivot + 1, nums.length), target);
                    System.out.println("Intermediate result=>"+result);
                    if(result> -1)
                        result = pivot+result+1;
                }

                else if(target==nums[pivot])
                    result = pivot;
            }

        }
        System.out.println("Pivot =>"+pivot);
        System.out.println(Arrays.toString(nums));
        return (result>=0)? result:-1 ;
    }
}

public class Q2_Search_In_Rotated_Sorted_Array
{
    /*
        There is an integer array nums sorted in ascending order (with distinct values).

        Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is
        [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
        For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

        Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.


        Example 1:
            Input: nums = [4,5,6,7,0,1,2], target = 0
            Output: 4

        Example 2:
            Input: nums = [4,5,6,7,0,1,2], target = 3
            Output: -1

        Example 3:
            Input: nums = [1], target = 0
            Output: -1
        */

    public static void main(String[] args)
    {
        solution_of_D3Q2 obj = new solution_of_D3Q2();
        //int[] arr = {4,5,6,7,0,1,2,3};
        //int[] arr = {6,7,8,0,1,4};
        int[] arr = {9,0,2,7,8};
        //int[] arr = {3,1,2};
        //int[] arr = {1};
        System.out.println(obj.search(arr,3));
        //obj.search(arr,2);
    }
}
