//link: https://leetcode.com/problems/binary-search/

//using recursion

class Solution {
    private int bs(int[] nums, int target, int s, int e){
        if(s > e)   return -1;
        
        int m = e + (s - e)/2;
        int elm = nums[m];
        if(target == elm)
            return m;
        if(target < elm)
            return bs(nums, target, s, m-1);
        if(target > elm)
            return bs(nums, target, m+1, e);
        
        return -1;
    }
    public int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length-1);
    }
}