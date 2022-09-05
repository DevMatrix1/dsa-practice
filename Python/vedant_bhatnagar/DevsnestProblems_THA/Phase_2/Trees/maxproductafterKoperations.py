import heapq
def solve(n, nums, k):
    # CODE HERE
    hp = []
    for i in nums:
        heapq.heappush(hp, i)
    heapq.heapify(hp)
    while k:
        el=heapq.heappop(hp)
        el+=1
        heapq.heappush(hp, el)
        k-=1
    maxProduct=1
    for i in hp:
        maxProduct*=i
    return maxProduct % (10**9+7)