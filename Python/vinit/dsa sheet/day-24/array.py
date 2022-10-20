#Q:https://practice.geeksforgeeks.org/problems/element-appearing-once2552/0?company[]=Qualcomm&company[]=Qualcomm&difficulty[]=1&page=1&query=company[]Qualcommdifficulty[]1page1company[]Qualcomm&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=element-appearing-once

 '''def search(self, A, N):
        # your code here
        '''res = 0
        for i in arr:
            res ^= i
        return res'''
        '''left,right = 0,N-1 
        while left<right:
            m = (left+right)//2
            if m%2==1:
                if A[m]==A[m-1]: left=m+1
                else: right = m-1
            else:
                if A[m]==A[m+1]: left=m+2
                else: right = m
        return A[left]
'''
        dict = {}
        for i in range(N):
            if A[i] in dict:
                dict[A[i]] +=1
            else:
                dict[A[i]] =0
        for i in range(N):
            if dict[A[i]] == 0:
                return A[i]
'''


#Q:https://practice.geeksforgeeks.org/problems/search-in-a-matrix17201720/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-a-matrix

'''def matSearch(self,mat, N, M, X):
		# Complete this function
		for i in  range(N):
		    for j in range(M):
		        if mat[i][j]==X:
		            return 1
	    return 0
'''