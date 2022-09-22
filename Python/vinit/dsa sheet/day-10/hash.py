#Q:https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0

'''def frequencyCount(self, arr, N, P):
        dic={}
        for i in arr:
            dic[i]=1+dic.get(i,0)
        for i in range(N):
            arr[i]=dic[i+1]if i+1 in dic else 0'''
        