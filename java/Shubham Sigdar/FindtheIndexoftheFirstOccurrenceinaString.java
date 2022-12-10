//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//
//
//        Example 1:
//
//        Input: haystack = "sadbutsad", needle = "sad"
//        Output: 0
//        Explanation: "sad" occurs at index 0 and 6.
//        The first occurrence is at index 0, so we return 0.
//        Example 2:
//
//        Input: haystack = "leetcode", needle = "leeto"
//        Output: -1
//        Explanation: "leeto" did not occur in "leetcode", so we return -1.

public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return -1;
        }

    }
}
