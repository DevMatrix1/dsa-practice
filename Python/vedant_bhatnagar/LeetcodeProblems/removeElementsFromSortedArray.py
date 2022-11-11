Link - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

# Solution

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # temp = sorted(dict(Counter(nums)))
        # for i in range(0,len(temp)):
        #     nums[i] = temp[i]
        # return len(temp)
        
        i = j = 0
        lastnum = nums[i]
        if len(nums) == 1:
            return 1
        while (j < len(nums)):
            if lastnum == nums[j]:
                j+=1
            else:
                nums[i+1] = nums[j]
                lastnum = nums[j]
                j+=1
                i+=1
        return i+1
