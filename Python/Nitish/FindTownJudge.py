from typing import List


class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        # find the node with outdegree zero and indegree equal to n-1
        outdegree= [0 for _ in range(n)]
        indegree = [0 for _ in range(n)]
        for a,b in trust:
            outdegree[a-1]+=1
            indegree[b-1]+=1 
        
        for i in range(n):
            if outdegree[i]==0 and indegree[i]==n-1:
                return i+1
        
        return -1
def main():
    
    n = 3; trust = [[1,2],[2,3]]
    
    print(Solution().findJudge(n,trust))
if __name__ == '__main__':
    main()
