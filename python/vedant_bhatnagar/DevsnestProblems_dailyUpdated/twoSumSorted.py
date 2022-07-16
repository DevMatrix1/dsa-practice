def solve(n, arr, target):
    # CODE HERE
    low = 0
    high = n-1
    sum = 0
    while(low<high):
        sum = 0
        sum = arr[low] + arr[high]
        if target > sum:
            low += 1
        elif target < sum:
            high -= 1
        else:
            return [low+1, high+1] 
