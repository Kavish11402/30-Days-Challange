package Day_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution_of_D10Q3
{
    public int[][] merge(int[][] intervals)
    {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        if (intervals.length == 0)
            return ans.toArray(new int[0][]);

        int[] temp = intervals[0];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= temp[1]) {
                temp[1] = Math.max(temp[1], intervals[i][1]);
            } else {
                ans.add(temp);
                temp = intervals[i];
            }
        }
        ans.add(temp);

        return ans.toArray(new int[0][]);
    }
}

public class Q3_Merge_Intervals
{
    /*
        Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

            Example 1:
                Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
                Output: [[1,6],[8,10],[15,18]]
                Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

            Example 2:
                Input: intervals = [[1,4],[4,5]]
                Output: [[1,5]]
                Explanation: Intervals [1,4] and [4,5] are considered overlapping.
    */
    public static void main(String[] args) {
        solution_of_D10Q3 obj = new solution_of_D10Q3();
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(obj.merge(arr)));
    }
}
