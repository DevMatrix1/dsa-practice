# Link - https://leetcode.com/problems/reverse-vowels-of-a-string/description/
  
#   Solution
class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        vowels = {"a": 1, "e":1, "i":1, "o":1, "u":1, "A": 1, "E": 1, "I":1, "O":1, "U":1}
        vow = []
        for i in range(0, len(s)):
            if s[i] in vowels:
                vow.append(s[i])
        newStr = ""
        for i in range(0, len(s)):
            if s[i] in vowels:
                newStr = newStr + vow.pop()
            else:
                newStr += s[i]
        return newStr 
