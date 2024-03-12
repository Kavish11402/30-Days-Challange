package Day_12;

class solution_of_D12Q3
{
    public int titleToNumber(String columnTitle)
    {
        int sum=0;
        for(int i=0; i<columnTitle.length(); i++)
        {
            sum = sum + ((int)columnTitle.charAt(i)-64);
            if(i!=(columnTitle.length()-1))
                sum*=26;
        }
        return sum;
    }
}

public class Q3_Excel_Sheet_Column_Number
{
    /*
        Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

            For example,
            A -> 1
            B -> 2
            C -> 3
            ...
            Z -> 26
            AA -> 27
            AB -> 28
            ...


            Example 1:
                Input: columnTitle = "A"
                Output: 1

            Example 2:
                Input: columnTitle = "AB"
                Output: 28

            Example 3:
                Input: columnTitle = "ZY"
                Output: 701
    */
    public static void main(String[] args)
    {
        solution_of_D12Q3 obj = new solution_of_D12Q3();
        System.out.println(obj.titleToNumber("AB"));
    }
}
