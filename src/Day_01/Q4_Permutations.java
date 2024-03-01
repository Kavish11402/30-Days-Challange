package Day_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution_of_D1Q4
{
    private void swap (int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    private void permutation( int[] arr,List<List<Integer>> result ,int start, int end )
    {
        if (start == end)
            result.add(Arrays.stream(arr).boxed().toList());
        else
        {
            for (int i = start; i <= end; i++) {
                swap(arr, start, i);
                permutation(arr, result, start + 1, end);
                swap(arr, start, i);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums,result ,0,(nums.length-1));
        return result;
    }

}

public class Q4_Permutations
{

    /*
        TOPIC: Array Backtracking

        Given an array nums of distinct integers, return all the possible permutations.
        You can return the answer in any order.

        Example 1:
            Input: nums = [1,2,3]
            Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

        Example 2:
            Input: nums = [0,1]
            Output: [[0,1],[1,0]]

        Example 3:
            Input: nums = [1]
            Output: [[1]]
    */

    public static void main(String[] args) {
        solution_of_D1Q4 obj = new solution_of_D1Q4();
        int[] array = {1,2,3,4};
        System.out.println(obj.permute(array));
    }
}