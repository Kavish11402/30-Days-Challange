package Day_06;

import java.util.Stack;

class solution_of_D6Q3
{
    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                }
            }
        }
        return (stack.isEmpty());
    }
}

public class Q3_Valid_Parentheses
{
    /*
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:
            1. Open brackets must be closed by the same type of brackets.
            2. Open brackets must be closed in the correct order.
            3. Every close bracket has a corresponding open bracket of the same type.

            Example 1:
                Input: s = "()"
                Output: true

            Example 2:
                Input: s = "()[]{}"
                Output: true

            Example 3:
                Input: s = "(]"
                Output: false
    */
    public static void main(String[] args)
    {
        solution_of_D6Q3 obj = new solution_of_D6Q3();
        String s = "([{}][]())[]][";
        System.out.println(obj.isValid(s));
    }
}
