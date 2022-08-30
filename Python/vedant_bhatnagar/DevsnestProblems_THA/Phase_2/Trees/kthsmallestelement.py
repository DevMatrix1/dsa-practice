import heapq

def solve(matrix, k):
    # CODE HERE
    hp = []
    for i in matrix:
        for j in i:
            if len(hp)<k:
                heapq.heappush(hp, -j)
            else:
                if hp[0]<=-j:
                    heapq.heappush(hp, -j)
                    heapq.heappop(hp)
    return -hp[0]     
