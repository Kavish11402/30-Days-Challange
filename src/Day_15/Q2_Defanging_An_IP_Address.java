package Day_15;

class solution_of_D15Q2
{
    public String defangIPaddr(String address)
    {
        StringBuilder res = new StringBuilder();

        for(char c:address.toCharArray())
        {
            if(c=='.')
                res.append("[.]");
            else
                res.append(c);

        }
        return res.toString();
    }
}

public class Q2_Defanging_An_IP_Address
{
    /*
        Given a valid (IPv4) IP address, return a defanged version of that IP address.
        A defanged IP address replaces every period "." With "[.]".


            Example 1:
                Input: address = "1.1.1.1"
                Output: "1[.]1[.]1[.]1"

            Example 2:
                Input: address = "255.100.50.0"
                Output: "255[.]100[.]50[.]0"
    */
    public static void main(String[] args)
    {
        solution_of_D15Q2 obj = new solution_of_D15Q2();
        System.out.println(obj.defangIPaddr("255.100.50.0"));
    }
}
