#Q:https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

# ans=list(set(a+b))
        # ans.sort()
        # return ans
       ''' d={}   
        l=[] 
        for i in a:
            if i not in d:
                d[i]=1
                l.append(i)
            else:
                continue
        for j in range(m):
            if b[j] not in d:
                d[b[j]]=1
                l.append(b[j])
            else:
                continue
        l.sort()
        return(l)'''

#Q:https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number

'''sumM=0
    for i in (A):
        sumM=sumM+i
    x=N*(N+1)//2
    return x-sumM'''

