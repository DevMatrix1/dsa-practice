#Q:https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicate-elements-from-sorted-array

	'''def remove_duplicate(self, A, N):
	    #two pointer approach
	    slow=0
	    fast=1
	    while(fast<N):
	        if(A[slow]!=A[fast]):
	            slow+=1
	            A[slow]=A[fast]
            fast+=1
        return slow+1'''

#Q:https://practice.geeksforgeeks.org/problems/quick-left-rotation3806/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-left-rotation

  '''if k<n:
            arr[:]=arr[k:]+arr[:k]
        else:
            d=k%n
            arr[:]=arr[d:]+arr[:d]
        return arr[:]
'''