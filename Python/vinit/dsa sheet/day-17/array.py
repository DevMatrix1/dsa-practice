#Q:https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

'''def print2largest(self,arr, n):
	    larg=arr[0]
	    #assume sl to -1 
	    secondlargest=-1
	    #check for largest
	    for i in arr:
	        if i>larg:
	            larg=i
	   # check for second largest
        for j in arr:
            if j>secondlargest and j<larg:
                secondlargest=j
        return secondlargest
	        '''

#Q:https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted

'''def arraySortedOrNot(self, arr, n):
        # code here
        for i in range(1,n):
            if arr[i]<arr[i-1]:
                return 0
        return 1
        '''
        
        
        '''arr2=[]
        for i in range(n):
            arr2.append(arr[i])
        arr2.sort()
        if arr==arr2:
            return 1
        return 0
'''
