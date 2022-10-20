 Q:https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/   

  
  
  ''' Iterate from the back to the start,
We initilize mx = -1, where mx represent the max on the right.
Each round, we set A[i] = mx, where mx is its mas on the right.
Also we update mx = max(mx, A[i]), where A[i] is its original value.'''
        mx=-1
        for i in range(len(arr)-1,-1,-1):
            arr[i],mx=mx,max(mx,arr[i])
        return arr
        

