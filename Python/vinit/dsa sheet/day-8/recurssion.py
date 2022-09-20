#link-https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops

'''print n number without loop:
def printNos(self,N):
        if N<1:
            return
        else:
            self.printNos(N-1)
            print(N,end=" ")'''

#Q2:https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sum-of-first-n-terms

 '''def sumOfSeries(self,N):
        #code here
         return ((N*(N+1))//2)**2
        '''if N==0:
            return 0
	    return pow(N,3) + self.sumOfSeries(N-1)'''

#Q3:https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty[]=-1&page=1&query=problemTypefunctionaldifficulty[]-1page1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-factorial-numbers-less-than-or-equal-to-n

'''def factorialNumbers(self, N):
        def solve_recur(factorial,x,ans):
    	    if factorial > N:
    	        return
    	    ans.append(factorial)
    	    solve_recur(factorial*x,x+1,ans)
    	    
    	ans = []
    	solve_recur(1,2,ans)
    	return ans'''