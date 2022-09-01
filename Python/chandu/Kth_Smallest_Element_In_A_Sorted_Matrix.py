import heapq
def solve(matrix, k):
    # CODE HERE
    hp = []
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            heapq.heappush(hp, matrix[i][j])
    
    while k-1:
        heapq.heappop(hp)
        k -= 1
    return heapq.heappop(hp)
