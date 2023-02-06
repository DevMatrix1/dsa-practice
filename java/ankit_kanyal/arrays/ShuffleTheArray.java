// link- https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int pos=0;
        for(int i=0;i<n;i++)
        {
            result[pos++] = nums[i];
            result[pos++] = nums[i+n];
        }
        return result;
    }
}
