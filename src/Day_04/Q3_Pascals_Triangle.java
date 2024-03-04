package Day_04;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class solution_of_D4Q3
{
    public BigInteger factorial(int num)
    {
        if(num==0)
            return BigInteger.valueOf(1);
        return BigInteger.valueOf(num).multiply(factorial(num-1));
    }
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numRows; i++)
        {
            List<Integer> tList = new ArrayList<>();
            for (int j=0; j<=i; j++)
            {
                tList.add(factorial(i).divide(factorial(j).multiply(factorial(i-j)) ).intValue());
            }
            list.add(tList);
        }
        return list;
    }
}

public class Q3_Pascals_Triangle
{

    /*
        Given an integer numRows, return the first numRows of Pascal's triangle.
        In Pascal's triangle, each number is the sum of the two numbers directly above it.

            Example 1:
                Input: numRows = 5
                Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

            Example 2:
                Input: numRows = 1
                Output: [[1]]
    */

    public static void main(String[] args)
    {
        solution_of_D4Q3 obj = new solution_of_D4Q3();
        System.out.println(obj.generate(14));
    }
}
