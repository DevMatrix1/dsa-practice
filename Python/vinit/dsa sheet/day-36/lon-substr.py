Q:https://leetcode.com/problems/longest-continuous-increasing-subsequence/submissions/

  def findLengthOfLCIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        
        cur_len = 1
        max_len = 1
        
        for i in range(1,len(nums)):
            if nums[i] > nums[i-1]:
                cur_len += 1
            else:
                max_len = max(max_len,cur_len)
                cur_len = 1
        
        return max(max_len,cur_len)
        