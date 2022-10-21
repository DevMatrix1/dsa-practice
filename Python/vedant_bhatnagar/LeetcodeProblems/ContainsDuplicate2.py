# Link - https://leetcode.com/problems/contains-duplicate-ii/submissions/

# Solution

class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        m = dict()
        for i in range(len(nums)):
            if nums[i] in m:
                if abs(i-m[nums[i]]) <=k:
                    return True
                else:
                    m[nums[i]] = i
            else:
                m[nums[i]] = i
        return False
