package Day_02;

import java.util.Arrays;

class solution_of_D2Q3
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int[] c = new int[ nums1.length + nums2.length ];
        System.arraycopy( nums1 , 0 , c , 0 , nums1.length );
        System.arraycopy( nums2 , 0 , c , nums1.length , nums2.length );
        Arrays.sort(c);

        if( c.length%2==0 )
            return ((double)(c[(c.length/2)-1]+c[(c.length/2)]))/2;
        else
            return c[(c.length/2)];
    }
}

public class Q3_Median_of_Two_Sorted_Arrays
{

    /*
        Example 1:
            Input: nums1 = [1,3], nums2 = [2]
            Output: 2.00000
            Explanation: merged array = [1,2,3] and median is 2.

        Example 2:
            Input: nums1 = [1,2], nums2 = [3,4]
            Output: 2.50000
            Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5
    */

    public static void main(String[] args)
    {
        solution_of_D2Q3 obj = new solution_of_D2Q3();
        int[] a1 = {1,3};
        int[] a2 = {2,4};
        System.out.println(obj.findMedianSortedArrays(a1,a2));
    }
}
