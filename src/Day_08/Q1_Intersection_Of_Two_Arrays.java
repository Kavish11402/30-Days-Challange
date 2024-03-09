package Day_08;

import java.util.Arrays;

class solution_of_D8Q1
{
    public int[] intersect(int[] nums1, int[] nums2)
    {
        Arrays.sort(nums1); Arrays.sort(nums2);
        int[] inSect = new int[1001];
        int sn1=0, sn2=0, k=0;

        while (  sn1<nums1.length && sn2<nums2.length  )
        {
            if( nums1[sn1] == nums2[sn2] )
            {
                inSect[k] = nums1[sn1];
                sn1++; sn2++; k++;
            }
            else if( nums1[sn1] < nums2[sn2] )
                sn1++;
            else
                sn2++;
        }
        return Arrays.copyOfRange(inSect,0,k);
    }
}

public class Q1_Intersection_Of_Two_Arrays
{
    /*
        Given two integer arrays nums1 and nums2, return an array of their intersection.
        Each element in the result must appear as many times as it shows in both arrays, and you may return the result in any order.

            Example 1:
                Input: nums1 = [1,2,2,1], nums2 = [2,2]
                Output: [2,2]

            Example 2:
                Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
                Output: [4,9]
                Explanation: [9,4] is also accepted.
    */
    public static void main(String[] args)
    {
        solution_of_D8Q1 obj = new solution_of_D8Q1();
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(obj.intersect(num1, num2)));
    }
}
