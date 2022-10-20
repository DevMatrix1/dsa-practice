# Link: https://leetcode.com/problems/top-k-frequent-words/

# Solution

class Solution(object):
    def topKFrequent(self, words, k):
        """
        :type words: List[str]
        :type k: int
        :rtype: List[str]
        """
        newDict = dict()
        wordCount = dict(Counter(words))
        for i in sorted(list(wordCount.values())):
            if i in newDict:
                continue
            else:
                newDict[i]=[]
                for j in wordCount:
                    if wordCount[j] == i:
                        newDict[i].append(j)

        print("newDict", newDict)
        print("wordCount", wordCount)

        a = sorted(newDict.items())
        a.reverse()
        ans = []

        for i in a:
            i[1].sort()
            for j in i[1]:
                if len(ans) < k:
                    ans.append(j)
                else:
                    break
        return ans
