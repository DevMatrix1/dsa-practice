# Q:https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=move-all-zeroes-to-end-of-array

'''def pushZerosToEnd(self,arr, n):
    	# code here
    	i = 0
    	j = 0
        while j < n:
            if arr[j] == 0:
                j += 1
                continue
            arr[i], arr[j] = arr[j], arr[i]
            i += 1
            j += 1
'''