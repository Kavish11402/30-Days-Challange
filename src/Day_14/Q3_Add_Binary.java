package Day_14;

class solution_of_D14Q3
{
    public String addBinary(String a, String b)
    {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1)
        {
            if(i >= 0)
                carry += a.charAt(i--) - '0';
            if(j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}

public class Q3_Add_Binary
{
    /*
        Given two binary strings a and b, return their sum as a binary string.

            Example 1:
                Input: a = "11", b = "1"
                Output: "100"

            Example 2:
                Input: a = "1010", b = "1011"
                Output: "10101"
    */
    public static void main(String[] args)
    {
        solution_of_D14Q3 obj = new solution_of_D14Q3();
        System.out.println(obj.addBinary("11","1"));
    }
}