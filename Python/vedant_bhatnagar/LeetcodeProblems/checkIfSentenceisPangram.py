# Link - https://leetcode.com/problems/check-if-the-sentence-is-pangram/

# Solution

class Solution(object):
    def checkIfPangram(self, sen):
        """
        :type sentence: str
        :rtype: bool
        """
        s=set()
        for i in range(97,123):
            s.add(i)
        if len(sen)<26:
            return False
        for i in sen:
            if ord(i) in s:
                s.remove(ord(i))
            else:
                continue
        return len(s) == 0
