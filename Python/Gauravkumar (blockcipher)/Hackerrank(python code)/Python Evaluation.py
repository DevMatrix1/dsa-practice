# https://www.hackerrank.com/challenges/python-eval/problem?isFullScreen=false
# Coded By Block_Cipher

import math

l = []
n = input()
for i in n:
    # print(i)
    if i.isdigit():
        l.append(i)
# print(l)
li1 = int(l[0])
li2 = int(l[1])


# int1 = int(l)
if li1==1 and li2:
    print(0)
else:
    print(li2+li1)
