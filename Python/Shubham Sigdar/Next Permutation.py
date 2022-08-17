def solve(n, nums):
    for i in range(n-1,0,-1):
        if nums[i] > nums[i-1]:

            # Find the smallest greater num on the right
            j=0
            min_elem_ind = 0
            for j in range(i,n):
                if nums[j] > nums[i-1]:
                    min_elem_ind = j

            #swap the elements
            temp = nums[i-1]
            nums[i-1]=nums[min_elem_ind]
            nums[min_elem_ind]=temp

            #Reverse the list starting from i
            left = i
            right=n-1
            while left<right:
                nums[left],nums[right]=nums[right],nums[left]
                left+=1
                right-=1
            return nums
    nums.reverse()
    return nums