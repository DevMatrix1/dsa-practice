# https://www.hackerrank.com/challenges/ginorts/problem?isFullScreen=false
# Enter your code here. Read input from STDIN. Print output to STDOUT

# Coded By Block_Cipher

import math


s = input()

u = []
l = []
o = []
e = []

for i in s:
    if i.isupper():
        u.append(i)
    elif i.islower():
        l.append(i)
    elif i.isdigit():
        if int(i)%2==0:
            e.append(i)
        else:
            o.append(i)

n_l = sorted(l)+sorted(u)+sorted(o)+sorted(e)
# print(n_l)
for i in n_l:
    print(i,end='')
