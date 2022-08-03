class Solution(object):
    def converttomap(self, word):
        m = dict()
        s = set()
        ans = []
        cnt = 1
        for i in word:
            if i not in s:
                s.add(i)
                m[i] = cnt
                cnt += 1
        string = ""
        for i in word:
            ans.append(str(m[i]))
        return ans
        
    
    
    def findAndReplacePattern(self, words, pattern):
        """
        :type words: List[str]
        :type pattern: str
        :rtype: List[str]
        """
        pat = self.converttomap(pattern)
        ans = []
        for i in words:
                temp = self.converttomap(i)
                if temp == pat:
                    ans.append(i)
        return ans
        