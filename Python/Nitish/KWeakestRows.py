from typing import List 
import heapq 
class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        rowmap = {}
        
        for ind,row in enumerate(mat):
            rowmap[ind] = row.count(1)
        
        minHeap = [(count,rowidx) for rowidx,count in rowmap.items()]
        heapq.heapify(minHeap)
        res = []
        while k>0:
            _,idx = heapq.heappop(minHeap)
            res.append(idx)
            k-=1 
        return res 


if __name__=="__main__":
    mat = [[1,1,0,0,0],[1,1,1,1,0],[1,0,0,0,0],[1,1,0,0,0],[1,1,1,1,1]] 
    k = 3
    print(Solution().kWeakestRows(mat,k))
