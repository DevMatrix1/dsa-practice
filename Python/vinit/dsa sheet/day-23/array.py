#Q:https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k

'''def lenOfLongSubarr (self, arr, n, k) : 
        #Complete the function
        ans,s=0,0
        d={}
        d[0]=-1 # since s=0
        for i in range(n):
            s+=arr[i]
            if (s-k) in d:
                ans=max(ans, i-d[s-k])
            if s not in d:
                d[s]=i
        return ans'''