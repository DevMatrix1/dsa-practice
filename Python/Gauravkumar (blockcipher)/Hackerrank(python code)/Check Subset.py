# https://www.hackerrank.com/challenges/py-check-subset/problem?isFullScreen=false
# Coded By Block_Cipher

# Enter your code here. Read input from STDIN. Print output to STDOUT

for _ in range(int(input())):
        x = int(input())
        a = input().split()
        y = int(input())
        b = input().split()
        
        p = set(a)
        q = set(b)
        
        c = p.difference(q)
        if (len(c)==0):
                print('True')
        else:
                print('False')
