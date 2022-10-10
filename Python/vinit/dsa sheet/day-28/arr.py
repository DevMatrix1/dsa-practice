#Q:https://practice.geeksforgeeks.org/problems/peak-element/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=peak-element

 '''def peakElement(self,arr, n):
        if(n==1):
            return 0
        ma=max(arr)
        index_ma = arr.index(ma)
        if(index_ma==0):
            if(ma-arr[index_ma+1])>=1:
                return index_ma
            else:
                return -1
        elif(index_ma==(n-1)):
            if(ma-arr[index_ma-1]>=1):
                return index_ma
            else:
                return -1
        else:
            if(ma-arr[index_ma-1])>=1 and (ma-arr[index_ma+1])>=1:
                return index_ma
            else:
                return -1
        # res = max(arr)
        # return arr.index(res)'''