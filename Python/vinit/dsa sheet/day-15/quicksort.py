#Q:https://practice.geeksforgeeks.org/problems/quick-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-sort

'''def quickSort(self,arr,low,high):
       if low<high:
           pivot_index=self.partition(arr,low,high)
           self.quickSort(arr,low,pivot_index-1)
           self.quickSort(arr,pivot_index+1,high)
       return arr    
       
   
    def partition(self,arr,low,high):
        pivot=arr[high]
        ptr=low
        for index in range(low,high):
            if arr[index]<= pivot:
                arr[index],arr[ptr]=arr[ptr],arr[index]
                ptr+=1
        arr[high],arr[ptr]=arr[ptr],arr[high]
        return ptr'''