# link - https://leetcode.com/problems/longest-common-prefix/submissions/

# Solution

class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 1:
            return strs[0]
        if len(strs[0]) == 0:
            for i in range(1, len(strs)):
                if len(strs[i]) == 0:
                    continue
            return ""
        checklen = len(strs[0])
        j = 1
        n = len(strs)
        s = strs[0][0:j]
        ans = ""
        while True:
            count = 0
            for i in range(1, n):
                check = strs[i]
                if check.startswith(s):
                    count+=1
                    if count == n-1:
                        ans = s
                        j+=1
                        if len(s) == checklen:
                            return ans
                        s = strs[0][0:j]
                else:
                    return ans
        
