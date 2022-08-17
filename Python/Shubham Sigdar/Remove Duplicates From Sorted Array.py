def solve(n, arr):
    arr1=[arr[0]]
    for i in range(n):
        if arr1[-1]!=arr[i]:
            arr1.append(arr[i])
    return arr1
