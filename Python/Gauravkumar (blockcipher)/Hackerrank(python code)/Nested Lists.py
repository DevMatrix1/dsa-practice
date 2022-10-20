# Coded By Block_Cipher

# https://www.hackerrank.com/challenges/nested-list/problem?isFullScreen=false


import math
l = []    
s_l_n = []
score = set()

for _ in range(int(input())):
    n = input()
    s = float(input())


    l.append([n,s])
    score.add(s)

s_l = sorted(score)[1]

for n,s in l:
    if s==s_l:
        s_l_n.append(n)
for n in sorted(s_l_n):
    print(n,end='\n')
