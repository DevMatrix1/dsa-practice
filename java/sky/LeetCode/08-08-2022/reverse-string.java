//Link: https://leetcode.com/problems/reverse-string/

//using recursion

class Solution {
    private void revStr(char[] s, int f, int b){
        if(f >= b)  return;
        char temp = s[f];
        s[f] = s[b];
        s[b] = temp;
        revStr(s, f+1, b-1);
    }
    public void reverseString(char[] s) {
        revStr(s, 0, s.length-1);
    }
}