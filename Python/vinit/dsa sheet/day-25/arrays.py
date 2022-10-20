#Q:https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-pairs-whose-sum-is-x
'''def allPairs(self, A, B, N, M, X):
        # Your code goes here 
        A.sort()
        count=[]
        for i in range(N):
            for j in range(M):
                if(A[i]+B[j]==X):
                    count+=[(A[i],B[j])]
        return count
         ''' '''new=dict()
        a=[]

        for i in A:

            new[i]=X-i

        for i in new.keys():

            if new[i] in B:

                a.append((i,new[i]))

        a.sort()

        return a
    '''


#Q:https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sort-an-array-of-0s-1s-and-2s

#def sort012(self,arr,n):
        # code here
        '''red, white, blue = 0, 0, len(arr)-1
    
        while white <= blue:
            if arr[white] == 0:
                arr[red], arr[white] = arr[white], arr[red]
                white += 1
                red += 1
            elif arr[white] == 1:
                white += 1
            else:
                arr[white], arr[blue] = arr[blue], arr[white]
                blue -= 1
#                 This is a dutch partitioning problem. We are classifying the array into four groups: red, white, unclassified, and blue. Initially we group all elements into unclassified. We iterate from the beginning as long as the white pointer is less than the blue pointer.

# If the white pointer is red (nums[white] == 0), we swap with the red pointer and move both white and red pointer forward. If the pointer is white (nums[white] == 1), the element is already in correct place, so we don't have to swap, just move the white pointer forward. If the white pointer is blue, we swap with the latest unclassified element.
'''