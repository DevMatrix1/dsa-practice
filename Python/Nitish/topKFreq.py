import heapq
from typing import List 
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = {}
        for el in nums:
            if el not in counter:
                counter[el]=1
            else:
                counter[el]+=1 
        
        hp = []
        for ele in counter:
            if len(hp)<k:
                heapq.heappush(hp,(counter[ele],ele))
            else:
                if hp[0][0]<counter[ele]:
                    heapq.heappush(hp,(counter[ele],ele))
                    heapq.heappop(hp)
        
        return [el for c,el in hp]

if __name__=="__main__":
    nums = [1,1,1,2,2,3]
    k = 2
    print(Solution().topKFrequent(nums,k))
