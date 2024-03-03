package Day_03;

import java.util.ArrayList;
import java.util.Arrays;

class solution_of_D3Q1
{
    public int[] searchRange(int[] nums, int target)
    {
        ArrayList<Integer> m = new ArrayList<>();

        for (int i=0; i< nums.length; i++)
        {
            if(nums[i]==target)
                m.add(i);
            else if ( nums[i]>target )
                break;
        }
        if(m.isEmpty())
            return new int[]{-1,-1};
        else
            return new int[]{m.getFirst(),m.getLast()};
    }
}

public class Q1_First_And_Last_Position_of_Element_In_Sorted_Array
{
    public static void main(String[] args)
    {
        solution_of_D3Q1 obj = new solution_of_D3Q1();
        int[] arr = {5,7,7,8,8,8,8,8,8,8,8,8,8,8,10};
        System.out.println( Arrays.toString(obj.searchRange(arr,8)) );
    }
}
