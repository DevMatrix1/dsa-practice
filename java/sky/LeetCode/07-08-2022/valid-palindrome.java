//link: https://leetcode.com/problems/valid-palindrome/

//Approach 1: converting whole string to lowercase then creating a new string having only alphanumeric characters. then using 2 pointers to find if it's a Palindromic string or not.

class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        
        String onlyLowerCase = s.toLowerCase();
        
        String onlyLowerAlphanum = "";
        
        for(int i = 0; i<n; i++){
            char c = onlyLowerCase.charAt(i);
            if((48 <= c && c <= 57) || (97 <= c && c <= 122))
                onlyLowerAlphanum = onlyLowerAlphanum + c;
        }

        int front = 0;
        int back = onlyLowerAlphanum.length() - 1;
        
        while(front < back){
            if(onlyLowerAlphanum.charAt(front) != onlyLowerAlphanum.charAt(back))
                return false;
            front++;
            back--;
        }
        
        return true;
    }
}

//Approach 2: similar to approach 1, haven't made new string. just made the original string toLowerCase() and then skipped non-alphanumeric characters when checking for palindrome 
class Solution {
    private boolean alphaNumeric(char c){
        if((48<=c && c<=57) || (97 <= c && c <= 122))
            return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        int front = 0;
        int back = n - 1;
        
        while(front < back){
            char charf = s.charAt(front);
            while(front < n-1 && alphaNumeric(s.charAt(front)) == false)
                front++;
            
            while(back > 0 && alphaNumeric(s.charAt(back)) == false)
                back--;
            
            if(front > back)
                break;
            
            
            if(s.charAt(front) != s.charAt(back))
                return false;
            front++;
            back--;
        }
        
        return true;
    }
}