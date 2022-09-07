import heapq
def solve(n, nums, k):
    # CODE HERE
    heapq.heapify(nums)
    for i in range(k):
        num = heapq.heappop(nums)+ 1
        heapq.heappush(nums, num)

    ans = 1
    for i in nums:
        ans *= i
    
    return ans%1000000007
