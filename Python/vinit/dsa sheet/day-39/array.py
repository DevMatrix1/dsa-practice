Q: https: // leetcode.com/problems/contains-duplicate-ii/submissions/


class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        # Create dictionary for Lookup
        lookup = {}

        for i in range(len(nums)):

            # If num is present in lookup and satisfy the condition return True
            if nums[i] in lookup and abs(lookup[nums[i]]-i) <= k:
                return True

            # If num is not present in lookup then add it to lookup
            lookup[nums[i]] = i

        return False
