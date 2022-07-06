def solve(n, arr, key):
    # CODE HERE
    low = 0
    high = len(arr) - 1
    while(low <= high):
        mid = (low + high)//2
        if(key == arr[mid]):
            return mid
        if(key > arr[mid]):
            low = mid+1
        else:
            high = mid-1
    return high+1
        