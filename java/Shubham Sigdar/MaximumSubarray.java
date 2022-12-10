//Given an integer array nums, find the subarray which has the largest sum and return its sum.
//
//
//
//        Example 1:
//
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
//        Example 2:
//
//        Input: nums = [1]
//        Output: 1
//        Example 3:
//
//        Input: nums = [5,4,-1,7,8]
//        Output: 23
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum=nums[0]; int sum1=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            sum1=Math.max(sum,sum1);
        }
        return sum1;
    }
}
