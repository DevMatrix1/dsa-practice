# 1. Brute force Error-Time Limit Exceeded
# Time complexity-o(n^3)
class Solution(object):
    def threeSum(self, nums):
        
        n=len(nums)
        target=0
        arr=[]
        result=[]
        for i,el1 in enumerate(nums):
            for j,el2 in enumerate(nums):
                for k,el3 in enumerate(nums):
                    if el1+el2+el3 == target and i!=j and i!=k and j!=k:
                        #sort 
                        arr=sorted([el1,el2,el3])
                       #remove duplicate elements
                        if arr not in result:
                            result.append( sorted( [el1 ,el2 , el3] ))
        

        return result


# 2. 2 pointer method

def solve(n, nums):
        res = []
        nums.sort()
        for i, a in enumerate(nums):
            #we don't wanna use same value in a same position
            if i > 0 and a == nums[i - 1]: #a == nums[i - 1] same element before
                continue
            
            l, r = i + 1, len(nums) - 1
            while l < r:
                threeSum = a + nums[l] + nums[r]
                if threeSum > 0:
                    r -= 1
                elif threeSum < 0:
                    l += 1
                else:
                    res.append([a, nums[l], nums[r]])
                    #update your pointer
                    while l < r and nums[l] == nums[l+1]: 
                        l += 1 
                    while l < r and nums[r] == nums[r-1]:
                        r -= 1 
                    l += 1; r -= 1

        return res