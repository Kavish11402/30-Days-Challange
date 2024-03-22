package Day_22;

class solution_of_D22Q1
{
    public int lengthOfLIS(int[] nums) {
        int[] lst = new int[nums.length + 1];
        lst[0] = Integer.MIN_VALUE;
        int ptr = 1;

        for(int num : nums){
            if(num > lst[ptr - 1]){
                lst[ptr] = num;
                ptr++;
            } else {
                int backptr = ptr - 1;
                while(num <= lst[backptr]){
                    backptr--;
                }

                lst[backptr + 1] = num;
            }
        }
        return ptr - 1;
    }
}

public class Q1_Longest_Increasing_Subsequence
{
    /*
        Given an integer array nums, return the length of the longest strictly increasing subsequence.


            Example 1:
                Input: nums = [10,9,2,5,3,7,101,18]
                Output: 4
                Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.

            Example 2:
                Input: nums = [0,1,0,3,2,3]
                Output: 4

            Example 3:
                Input: nums = [7,7,7,7,7,7,7]
                Output: 1
    */
    public static void main(String[] args)
    {
        solution_of_D22Q1 obj = new solution_of_D22Q1();
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(obj.lengthOfLIS(arr));
    }
}
