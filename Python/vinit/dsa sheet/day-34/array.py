#Q:https://practice.geeksforgeeks.org/problems/shuffle-integers2401/1

def shuffleArray(self, arr, n):
        # Your code goes here
        '''l=[]
        x=arr[:n//2]
        y=arr[n//2:]
        for i in range(len(x)):
            l.append(x[i])
            l.append(y[i])
        for i in range(n):
            arr[i]=l[i]'''
            
            
        for i in range(n//2):
           arr.append(arr[i])
           arr.append(arr[n//2+i])
       
       
       arr[:] = arr[n:]
       return arr