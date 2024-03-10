package Day_10;

class solution_of_D10Q2
{
    public boolean canJump(int[] arr)
    {
        int target = arr.length - 1;

        if (arr.length == 1)
            return true;

        int i = arr.length - 2;
        while (i >= 0) {
            if (arr[i] >= (target - i)) {
                target = i;
            }
            i--;
        }

        return target == 0;
    }
}

public class Q2_Jump_Game
{
    /*
        You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum
        jump length at that position.
        Return true if you can reach the last index, or false otherwise.
Q3
            Example 1:
                Input: nums = [2,3,1,1,4]
                Output: true
                Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

            Example 2:
                Input: nums = [3,2,1,0,4]
                Output: false
                Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
    */
    public static void main(String[] args)
    {
        solution_of_D10Q2 obj = new solution_of_D10Q2();
        int[] arr = {2,3,1,1,4};
        System.out.println(obj.canJump(arr));
    }
}
