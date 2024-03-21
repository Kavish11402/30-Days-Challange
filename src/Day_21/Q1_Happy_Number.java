package Day_21;

import java.util.ArrayList;

class solution_of_D21Q1
{
    public boolean isHappy(int n)
    {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 1)
        {
            while (n > 0)
            {
                sum = sum + ((n % 10)*(n % 10));
                n = n / 10;
            }
            n = sum;
            if (list.contains(n))
                break;
            list.add(n);
            sum = 0;
        }
        return n == 1;
    }
}

public class Q1_Happy_Number
{
    public static void main(String[] args)
    {
        solution_of_D21Q1 obj = new solution_of_D21Q1();
        System.out.println(obj.isHappy(12));
    }
}
