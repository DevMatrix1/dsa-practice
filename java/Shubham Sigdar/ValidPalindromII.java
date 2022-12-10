//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//
//
//
//        Example 1:
//
//        Input: s = "aba"
//        Output: true
//        Example 2:
//
//        Input: s = "abca"
//        Output: true
//        Explanation: You could delete the character 'c'.
//        Example 3:
//
//        Input: s = "abc"
//        Output: false
public class ValidPalindromII {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return remove(s,left+1,right) || remove(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean remove(String str,int l, int r){
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
