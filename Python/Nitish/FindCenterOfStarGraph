from typing import List


class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        #the node in center will be common in all edges
         return edges[0][0] if (edges[0][0]==edges[1][0] or edges[0][0]==edges[1][1]) else edges[0][1]

def main():
    edges = [[1,2],[2,3],[4,2]]
    print(Solution().findCenter(edges))
if __name__ == '__main__':
    main()
