//link: https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                if(nums[j] < nums[i] && res[i] <= res[j])
                    res[i] = res[j] + 1;
            } 
            if(res[i] == 0)
                res[i] = 1;
        }
        int ans = 0;
        for(int a: res)
            ans = Math.max(a, ans);
        
        return ans;
    }
}