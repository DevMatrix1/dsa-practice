// package DSA.Array;
//You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
//
//        Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//        Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
//        Return the string formed after mapping.
//
//        The test cases are generated so that a unique mapping will always exist.
//
//
//
//        Example 1:
//
//        Input: s = "10#11#12"
//        Output: "jkab"
//        Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
//        Example 2:
//
//        Input: s = "1326#"
//        Output: "acz"


public class DecryptStringfromAlphabettoIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                s1.append((char)('a'+(s.charAt(i-1)-'0') + 10*(s.charAt(i-2)-'0')-1));
                i-=2;
            }else{
                s1.append((char)('a' + (s.charAt(i)-'0')-1));
            }
        }
        s1.reverse();
        return s1.toString();
    }
}
