package Day_14;

class solution_of_D14Q1
{
    public String countAndSay(int n)
    {
        if(n==1)
            return "1";

        StringBuilder res = new StringBuilder("1");

        for (int i=2; i<=n; i++)
        {
            res.append("$");
            int count=1;
            StringBuilder temp = new StringBuilder();
            int s=0;
            while (res.charAt(s)!='$')
            {
                if( res.charAt(s)==res.charAt(s+count) )
                {  count++; }
                else
                {
                    temp.append(count);
                    temp.append(res.charAt(s));
                    s=s+count;
                    count=1;
                }
            }

            res=temp;
        }
        return res.toString();
    }
}

public class Q1_Count_And_Say
{
    /*
        The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

            countAndSay(1) = "1"
            countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.

        To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.

        Given a positive integer n, return the nth term of the count-and-say sequence.



        Example 1:
            Input: n = 1
            Output: "1"
            Explanation: This is the base case.

        Example 2:
            Input: n = 4
            Output: "1211"
            Explanation:
            countAndSay(1) = "1"
            countAndSay(2) = say "1" = one 1 = "11"
            countAndSay(3) = say "11" = two 1's = "21"
            countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
    */
    public static void main(String[] args)
    {
        solution_of_D14Q1 obj = new solution_of_D14Q1();
        System.out.println(obj.countAndSay(10));
    }
}
