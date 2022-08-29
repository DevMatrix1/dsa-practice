import heapq
def solve(n, nums, k):
    # CODE HERE
    heapq.heapify(nums)

    for i in range(n-k):
        heapq.heappop(nums)
    
    return heapq.heappop(nums)
