import heapq
def solve(n, nums, k):
    # CODE HERE
    hp = []
    for el in nums:
        if len(hp)<k:
            heapq.heappush(hp,el)
        else:
            if hp[0]<el:
                heapq.heappush(hp,el)
                heapq.heappop(hp)
    return hp[0]
