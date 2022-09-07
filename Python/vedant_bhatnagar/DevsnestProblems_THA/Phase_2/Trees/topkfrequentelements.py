import heapq
from collections import Counter

class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        hm = {}
        for i in nums:
            if i in hm:
                hm[i] = hm[i]+1
            else:
                hm[i]=1
        hp = []
        for el in hm:
            count = hm[el]
            heapq.heappush(hp,(count,el))
            if len(hp)>k:
                heapq.heappop(hp)
        return [x[1] for x in hp]