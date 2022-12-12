//Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//
//
//
//        Example 1:
//
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
//
//
//        Constraints:
//
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//        strs[i] consists of only lowercase English letters.
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        String commonPrefix="";
        int min =  Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(min>strs[i].length()){
                res=strs[i];
                min=strs[i].length();
            }
        }
        for(int i=0;i<res.length();i++){
            boolean flag= true;
            for(String str:strs){
                if(str.charAt(i)!=res.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                commonPrefix+=res.charAt(i);
            }else{
                return commonPrefix;
            }
        }
        return commonPrefix;
    }
}
