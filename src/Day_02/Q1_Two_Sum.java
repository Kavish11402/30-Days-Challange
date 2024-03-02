package Day_02;

import java.util.Arrays;
import java.util.HashMap;

class solution_of_D2Q1
{
    public int[] twoSum(int[] nums, int target)
    {
        System.gc();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++)
        {
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]),i};
            map.putIfAbsent(nums[i], i);

        }
        return new int[]{-1};
    }
}

public class Q1_Two_Sum
{

    /*
    Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]

    Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

    Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]
    */

    public static void main(String[] args)
    {
        solution_of_D2Q1 obj = new solution_of_D2Q1();
        int[] array = {3,2,4};
        System.out.println(Arrays.toString(obj.twoSum(array,6)));
    }
}
