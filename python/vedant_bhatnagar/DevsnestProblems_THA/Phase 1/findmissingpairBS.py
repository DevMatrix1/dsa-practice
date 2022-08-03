arr = [7,7,6,6,3,3,5,5,1,2,2]
     # 0 1 2 3 4 5 6 7 8 9 10
low = 0
high = len(arr)-1

while(low<=high):
  mid = (low+high)//2
  # print(arr[mid], "mid val")
  if mid == len(arr)-1:
    if arr[mid] == arr[mid-1]:
      pass
    else:
      print(arr[mid])
      break
  elif mid == 0:
    if arr[mid] == arr[mid-1]:
      pass
    else:
      print(arr[mid])
      break
  else:
    if not (arr[mid] == arr[mid+1] or arr[mid]==arr[mid-1]):
      print(arr[mid])
      break
  if arr[mid] == arr[mid-1]:
    if (high-mid+1)%2==0:
      low=mid+1
    else:
      high=mid-2
  if arr[mid] == arr[mid+1]:
    if (mid-low+1)%2==0:
      high=mid-1
    else:
      low=mid+2

  
  