#Q:https://practice.geeksforgeeks.org/problems/insertion-sort/0?category[]=Algorithms&page=1&query=category[]Algorithmspage1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insertion-sort

'''def insert(self, alist, index, n):
        for j in range(0, index)[::-1]:
            if alist[j+1] < alist[j]:
                temp = alist[j+1]
                alist[j+1]=alist[j]
                alist[j] = temp
        return alist
        '''key=alist[index]
        i=index-1
        while (i>=0 and alist[i]>key):
           alist[i+1]=alist[i]
           i=i-1
        alist[i+1]=key'''

           
        #code here
        
    #Function to sort the list using insertion sort algorithm.    
    def insertionSort(self, alist, n):
        #code here
        for i in range(0, n):
            alist = self.insert(alist,i , n)'''