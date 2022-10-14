# Q:https://leetcode.com/problems/maximum-subarray

#  def maxSubArray(self, nums: List[int]) -> int:
#         ans = -inf
#         currSum = 0
        
#         for num in nums:
#             currSum += num
#             ans = max(ans, currSum)
            
# 			# if currSum < 0 then why to accumulate it further just ignore it and make it 0
#             if currSum < 0:
#                 currSum = 0
        
#         return ans


#In this approach we will keep adding the element to current sum until it becomes negative, because we can have a bigger positive sum after our current element, but once the sum becomes negative, the postive sum coming before and after will be the maximum and we can't make a maximum sum including it.