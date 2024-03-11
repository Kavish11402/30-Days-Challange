package Day_11;


class solution_of_D11Q2
{
    public boolean isPalindrome(String str)
    {
        int s=0, e=str.length()-1;
        while ( s<e )
        {
            char startChar = Character.toLowerCase(str.charAt(s));
            char endChar = Character.toLowerCase(str.charAt(e));

            //If both start and end characters matches
            if(startChar==endChar)
            { s++; e--; continue; }

            //If both Start and End is an Alphabet or Number, but both do not match.
            if( (((startChar>='a'&&startChar<='z')||(startChar>='0'&&startChar<='9')) && ((endChar>='a'&&endChar<='z')||(endChar>='0'&&endChar<='9'))) && (startChar!=endChar) )
                return false;

            //If Start not an alphabet or number
            if(!((startChar>='a'&&startChar<='z')||(startChar>='0'&&startChar<='9')))
                s++;

            //If End not an alphabet or number
            if (!((endChar>='a'&&endChar<='z')||(endChar>='0'&&endChar<='9')))
                e--;
        }
        return true;
    }
}

public class Q2_Valid_Palindrome
{
    /*
        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads
        the same forward and backward. Alphanumeric characters include letters and numbers.

        Given a string s, return true if it is a palindrome, or false otherwise.

            Example 1:
                Input: s = "A man, a plan, a canal: Panama"
                Output: true
                Explanation: "amanaplanacanalpanama" is a palindrome.

            Example 2:
                Input: s = "race a car"
                Output: false
                Explanation: "raceacar" is not a palindrome.

            Example 3:
                Input: s = " "
                Output: true
                Explanation: s is an empty string "" after removing non-alphanumeric characters.
                Since an empty string reads the same forward and backward, it is a palindrome.
    */
    public static void main(String[] args)
    {
        solution_of_D11Q2 obj = new solution_of_D11Q2();
        System.out.println(obj.isPalindrome("1a2"));
        //obj.isPalindrome("1a 1");//abba
    }
}
