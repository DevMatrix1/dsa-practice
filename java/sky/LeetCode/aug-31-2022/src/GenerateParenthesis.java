//link: https://leetcode.com/problems/generate-parentheses
//Approach : simple backtracking, gave 2 options at every recursive call one to include '(' and second to include ')', also when open and closed braces became equal added them to answer_list as that is one of the answers, also checked if open > n OR closed > n if means invalid string that's why return and also closed should never be greater than open braces in the String otherwise String would be invalid
import java.util.*;
public class GenerateParenthesis {
    private static void helper(int n, int open, int closed, String str, List<String> ans){
        if(open == n && closed == n){
            ans.add(str);
            return;
        }

        if(closed > open || open > n)
            return;


        helper(n, open+1, closed, str+'(', ans);
        helper(n, open, closed+1, str+')', ans);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, 0, 0, "", ans);
        return ans;
    }

    public static void main(String[] args) {
        generateParenthesis(5);
    }
}
