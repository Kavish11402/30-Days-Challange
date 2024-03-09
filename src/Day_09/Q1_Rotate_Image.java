package Day_09;

import java.util.Arrays;

class solution_of_D9Q1
{
    public void rotate(int[][] matrix)
    {
        //Step 1 Find the transpose of the matrix
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=i; j<matrix[i].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //Step 2 Swap Columns
        for(int[] row : matrix)
        {
            int s=0, e= row.length-1;
            while (s<e)
            {
                row[s]=row[s]+row[e];
                row[e]=row[s]-row[e];
                row[s]=row[s]-row[e];
                s++;e--;
            }
        }
    }
}

public class Q1_Rotate_Image
{
    /*
        You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

        You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
        DO NOT allocate another 2D matrix and do the rotation.

            Example 1:
                Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
                Output: [[7,4,1],[8,5,2],[9,6,3]]

            Example 2:
                Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
                Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
    */
    public static void main(String[] args)
    {
        solution_of_D9Q1 obj = new solution_of_D9Q1();
        int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        obj.rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
