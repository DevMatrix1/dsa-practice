Link - https://leetcode.com/problems/maximum-69-number/description/
  
# Solution

class Solution(object):
    def maximum69Number (self, num):
        """
        :type num: int
        :rtype: int
        """
        ans = str(num)
        return ans.replace("6", "9", 1)
