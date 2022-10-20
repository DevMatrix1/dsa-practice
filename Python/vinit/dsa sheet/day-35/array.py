Q: https: // leetcode.com/problems/max-consecutive-ones/submissions/


def findMaxConsecutiveOnes(self, nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    count = 0
    maxCount = 0

    for idx, num in enumerate(nums):
        if num == 1:
            count += 1
        if num == 0 or idx == len(nums) - 1:
            maxCount = max(maxCount, count)
            count = 0

    return maxCount
