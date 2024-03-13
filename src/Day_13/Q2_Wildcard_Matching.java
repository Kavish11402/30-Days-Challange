package Day_13;

class solution_of_D13Q2
{
    public boolean isMatch(String s, String p) {
        return solve(s,p,0,0,new Boolean[s.length()][p.length()]);
    }

    private boolean solve(String s,String t,int i,int j,Boolean[][] dp){
        if(i==s.length()){
            return hasNoLCLeft(t,j);
        }
        if(j==t.length()){
            return i==s.length();
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(Character.isLowerCase(t.charAt(j)) && s.charAt(i)!=t.charAt(j)){
            return dp[i][j] = false;
        }
        if(t.charAt(j)=='*'){
            if(solve(s,t,i+1,j,dp)){
                return true;
            }
            if(solve(s,t,i,j+1,dp)){
                return true;
            }
        }
        return dp[i][j] = solve(s,t,i+1,j+1,dp)? true: false;
    }


    private boolean hasNoLCLeft(String t,int j){
        for(int i=j;i<t.length();i++){
            if(t.charAt(i)!='*'){
                return false;
            }
        }
        return true;
    }
}

public class Q2_Wildcard_Matching
{
    /*
        Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:

        '?' Matches any single character.
        '*' Matches any sequence of characters (including the empty sequence).
        The matching should cover the entire input string (not partial).


        Example 1:
            Input: s = "aa", p = "a"
            Output: false
            Explanation: "a" does not match the entire string "aa".

        Example 2:
            Input: s = "aa", p = "*"
            Output: true
            Explanation: '*' matches any sequence.

        Example 3:
            Input: s = "cb", p = "?a"
            Output: false
            Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
    */
    public static void main(String[] args)
    {
        solution_of_D13Q2 obj = new solution_of_D13Q2();
        System.out.println(obj.isMatch("aa","a"));
    }
}
