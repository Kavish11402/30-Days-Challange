package Day_03;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class solution_of_D3Q3
{
    private List<List<Integer>> twoSum(int[] arr , int comNum , int start)
    {
        List<List<Integer>> list = new ArrayList<>();
        int end = arr.length-1;
        while ( start<end )
        {
            if( arr[start]+arr[end]==-comNum )
            {
                List<Integer> tempList = new ArrayList<>(Arrays.asList(comNum,arr[start],arr[end]));
                list.add(tempList);
                start++; end--;
            }
            else if( arr[start]+arr[end]<-comNum ) { start++; }

            else if( arr[start]+arr[end]>-comNum ) { end--; }

        }
        return list;
    }
    public List<List<Integer>> threeSum(int[] nums)
    {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for( int i=0; i<=nums.length-3; i++ )
        {
            List<List<Integer>> temp = twoSum(nums,nums[i],i+1);
            if(!temp.isEmpty())
            {
                result.addAll(temp);
            }
        }
        return result.stream().distinct().toList();

    }
}

public class Q3_3Sum
{
    /*
        Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
        Notice that the solution set must not contain duplicate triplets.

        Example 1:
                Input: nums = [-1,0,1,2,-1,-4]
                Output: [[-1,-1,2],[-1,0,1]]
                Explanation:
                nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
                nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
                nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
                The distinct triplets are [-1,0,1] and [-1,-1,2].
                Notice that the order of the output and the order of the triplets does not matter.

        Example 2:
                Input: nums = [0,1,1]
                Output: []
                Explanation: The only possible triplet does not sum up to 0.

        Example 3:
                Input: nums = [0,0,0]
                Output: [[0,0,0]]
                Explanation: The only possible triplet sums up to 0.
    */
    public static void main(String[] args)
    {
        solution_of_D3Q3 obj = new solution_of_D3Q3();
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(obj.threeSum(arr));
    }
}
