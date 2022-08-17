# 1. Brute force 
def solve(n, arr):
    arr1=[]
    for i in range(n):
        mul=1
        for j in range(n):
            if i==j:
                continue
            mul=mul*arr[j]
        arr1.append(mul)
    return arr1

# 2 Using Division Method 

def solve(n, arr):
    mul=1
    countZero = 0
    for i in range(n):
        if arr[i]==0:
            countZero+=1
        else:
            mul=mul*arr[i]
    if countZero>1:
        return arr
    for i in range(n):
        if countZero==1:
            if arr[i]==0:
                arr[i]=mul
            else:
                arr[i]=0
        else:
            arr[i]=mul//arr[i]
    return arr

# 3 Using left and right

def solve(n, arr):
    left = [1 for i in range(n)] 
    left[0]=1
    for i in range(1,n):
        left[i]=left[i-1]*arr[i-1]
    right=[1 for i in range(n)]
    right[n-1]=1;
    for i in range(n-2,-1,-1):
        right[i]=right[i+1]*arr[i+1]
    for i in range(n):
        arr[i]=left[i]*right[i];
    return arr;