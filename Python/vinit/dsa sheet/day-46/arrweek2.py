Q
https: // leetcode.com/problems/check-if -all-1s-are-at-least-length-k-places-away/


def kLengthApart(self, nums: List[int], k: int) -> bool:
     count_zero = 0
      for i, n in enumerate(nums):
           if n == 1:
                if i != 0 and count_zero < k:
                    return False
                count_zero = 0
            elif n == 0:
                count_zero += 1

            if i == len(nums) - 1:
                return True
