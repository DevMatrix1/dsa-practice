// https://leetcode.com/problems/concatenation-of-array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int n = nums.length;
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[n+i]=ans[i];
        }
        return ans;
    }
}
// TC: O(2N)
// SC: O(2N)



class Solution {
    public int[] getConcatenation(int[] nums) {
        int ansLen = 2 * nums.length;
        int[] ans = new int[ansLen];

        int j = 0;
        while(j < ansLen) {
            for(int i = 0; i < nums.length; i++) {
                ans[j] = nums[i];
                j++;
            }
        }
        return ans;
    }
}

