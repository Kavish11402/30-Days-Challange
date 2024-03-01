package Day_01;

import java.util.List;
import java.util.ArrayList;

class solution_of_D1Q2
{
    public List<String> fizzBuzz(int n)
    {
        List<String> result = new ArrayList<>();
        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5==0)
                result.add("FizzBuzz");
            else if(i%3==0)
                result.add("Fizz");
            else if(i%5==0)
                result.add("Buzz");
            else
                result.add(Integer.toString(i));
        }
        return result;
    }
}

public class Q2_Fizz_Buzz
{
    /*
        Given a number n, for each integer i in the range from 1 to n inclusive
        print one value per line as follows:

        > if i is a multiple of 3 and 5, add FizzBuzz to the list
        > if i is a multiple of 3 but not 5, add Fizz to the list
        > if i is a multiple of 5 but not 3, add Buzz to the list
        > if i is not a multiple of 3 or 5, add i to the list

        Example 1:
            Input: n = 3
            Output: ["1","2","Fizz"]

        Example 2:
            Input: n = 5
            Output: ["1","2","Fizz","4","Buzz"]

        Example 3:
            Input: n = 15
            Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

    */
    public static void main(String[] args)
    {
        solution_of_D1Q2 obj = new solution_of_D1Q2();
        System.out.println("Start");
        System.out.println(obj.fizzBuzz(15));
    }
}
