# link - leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/


# Solution

class Solution(object):
    def longestPalindrome(self, words):

        dchar = dict()
        char = dict()
        vis = set()
        count=0
        odd=False
        for i in words:
            if i[0] == i[1]:
                if i in dchar:
                    dchar[i] += 1
                else:
                    dchar[i] = 1
                continue
            if i in char:
                char[i] += 1
            else:
                char[i] = 1
        for i in char:
            if i[::-1] in char and i not in vis and i[::-1] not in vis:
                vis.add(i)
                vis.add(i[::-1])
                count+=min(char[i], char[i[::-1]])*4
        
        for i in dchar:
            if dchar[i]%2==0:
                count+=dchar[i]*2
            else:
                count+=(dchar[i]-1)*2
                odd=True
        
        if odd:
            count+=2
        return count
