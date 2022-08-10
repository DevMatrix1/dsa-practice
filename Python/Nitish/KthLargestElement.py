import heapq 

def kthLargestElement(nums,k):
    hp = []
    for ele in nums:
        if len(hp)<k:
            heapq.heappush(hp,ele)

        else:
            if ele > hp[0]:
                heapq.heappop(hp)
                heapq.heappush(hp,ele)
    
    return hp[0]



nums = [3,2,3,1,2,4,5,5,6]
k = 4
print(kthLargestElement(nums,k))
