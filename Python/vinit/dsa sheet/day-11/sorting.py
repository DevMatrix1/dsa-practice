#Q:https://practice.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort

 '''def select(self, arr, i):
        minindx=i
        for j in range(i+1,len(arr)):
            if arr[minindx]>arr[j]:
                minindx=j
        return minindx
        # code here 
    
    def selectionSort(self, arr,n):
        for i in range(n-1):
            minindx=self.select(arr,i)
            arr[minindx],arr[i]=arr[i],arr[minindx]
'''