#Q1:https://practice.geeksforgeeks.org/problems/reverse-an-array/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reverse-an-array

'''
T = int(input())
while T > 0 :
    arraySize = int(input())
    arr=list(input().strip().split(" "))
    for num in arr[::-1]:
        print(num,end=" ")
    print()
    T-=1'''

#Q2:https://practice.geeksforgeeks.org/problems/palindrome-string0817/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=palindrome-string

'''class Solution:
	def isPalindrome(self, S):
		l = 0
        r = len(S)-1
        while l<r:
            if not S[l].isalnum():
                l += 1
            if not S[r].isalnum():
                r -= 1
            else:
                if S[l].lower() == S[r].lower():
                    l += 1
                    r -= 1
                else:
                    return 0
        return 1'''

#https://leetcode.com/problems/valid-palindrome/submissions/
'''class Solution:
    def isPalindrome(self, s: str) -> bool:
        st = re.sub(r"[^a-zA-Z0-9]", "", s).lower()
        if st == " ":
            return True
        start = 0
        end = len(st) - 1
        isPalindrome = True
        while(start<=end):
            if st[start] != st[end]:
                return False
            if st[start] == st[end]:
                start += 1
                end -= 1
        return isPalindrome'''
        #PART-2
        '''s="".join(filter(str.isalnum,s)).lower()
        if len(s)<2:
            return True 
        if s[0]!=s[-1]:
            return False
        return self.isPalindrome(s[1:-1])
        '''

#Q3:https://leetcode.com/problems/fibonacci-number/submissions/
'''class Solution:
    def fib(self, n: int) -> int:
        def Fibo(n):
            if (n == 0):
                return 0
            elif (n == 1):
                return 1
            else:
                return Fibo(n-1) + Fibo(n-2)
        return Fibo(n) '''

#part-2
#https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-first-n-fibonacci-numbers

'''class Solution:
    #Function to return list containing first n fibonacci numbers.
    def printFibb(self,n):
        ans = []
        for i in range(n) :
            if i == 0 or i == 1 :
               ans.append(1)
            else :
               ans.append(ans[-1]+ans[-2])
        return ans
'''