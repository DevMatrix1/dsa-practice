
//Anagram
import java.util.*;

class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(t1);

            return Arrays.equals(s1, t1);
        }
        return false;
    }

    public static void main(String[] args) {

    }
}