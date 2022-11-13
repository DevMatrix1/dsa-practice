Link - https://leetcode.com/problems/reverse-words-in-a-string/description/
  
# Solution

class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        ans = s.split(" ")
        ans.reverse()
        ansStr = ""
        for i in ans:
            if i == " " or i == "":
                continue
            else:
                ansStr = ansStr + i.strip() + " "
        return ansStr.strip()
