package Day_20;

class solution_of_D20Q2
{
    private String shift(char c, int x)
    {
        return String.valueOf((char)(c+x));
    }
    public String replaceDigits(String s)
    {
        StringBuilder res = new StringBuilder(s);

        for (int i=1;i<s.length();i=i+2)
        {
            res.replace(i,i+1,shift(res.charAt(i-1),Integer.parseInt(String.valueOf(res.charAt(i)))));
        }

        return res.toString();
    }
}

public class Q2_Replace_All_Digits_With_Characters
{
    /*
        You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

        There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

        For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
        For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).

        Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.



            Example 1:
                Input: s = "a1c1e1"
                Output: "abcdef"
                Explanation: The digits are replaced as follows:
                                - s[1] -> shift('a',1) = 'b'
                                - s[3] -> shift('c',1) = 'd'
                                - s[5] -> shift('e',1) = 'f'

            Example 2:
                Input: s = "a1b2c3d4e"
                Output: "abbdcfdhe"
                Explanation: The digits are replaced as follows:
                                - s[1] -> shift('a',1) = 'b'
                                - s[3] -> shift('b',2) = 'd'
                                - s[5] -> shift('c',3) = 'f'
                                - s[7] -> shift('d',4) = 'h'
    */
    public static void main(String[] args)
    {
        solution_of_D20Q2 obj = new solution_of_D20Q2();
        System.out.println(obj.replaceDigits("a1b2c3d4e"));
    }
}
