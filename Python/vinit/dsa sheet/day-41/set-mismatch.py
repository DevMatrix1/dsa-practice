Q: https: // leetcode.com/problems/set-mismatch/submissions/


class Solution:

    def findErrorNums(self, nums: List[int]) -> List[int]:
        n = len(nums)
        s = n*(n+1)//2
        miss = s - sum(set(nums))
        duplicate = sum(nums) + miss - s
        return [duplicate, miss]
