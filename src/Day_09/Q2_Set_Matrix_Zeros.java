package Day_09;

import java.util.Arrays;

class solution_of_D9Q2
{
    public void setZeroes(int[][] matrix)
    {
        for (int i=0; i< matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                if( matrix[i][j]==0 )
                {
                    //To Change Numbers in Row
                    for(int c=0; c< matrix[i].length; c++)
                    {
                        if(matrix[i][c]!=0)
                            matrix[i][c]=-404;
                    }

                    //To Change numbers in Column
                    for(int c=0; c< matrix.length; c++)
                    {
                        if(matrix[c][j]!=0)
                            matrix[c][j]=-404;
                    }
                }
            }
        }
        for(int i=0; i< matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                if (matrix[i][j]==-404)
                    matrix[i][j]=0;
            }
        }
    }
}

public class Q2_Set_Matrix_Zeros
{
    /*
        Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
        You must do it in place.

            Example 1:
                Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
                Output: [[1,0,1],[0,0,0],[1,0,1]]

            Example 2:
                Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
                Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
    */
    public static void main(String[] args)
    {
        solution_of_D9Q2 obj = new solution_of_D9Q2();
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        obj.setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
