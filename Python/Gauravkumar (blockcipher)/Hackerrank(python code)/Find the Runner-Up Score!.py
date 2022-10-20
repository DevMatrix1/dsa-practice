# Coded By Block_Cipher
# https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem

import math


n = int(input())
a = list(map(int,input().split()))
s = set(a)
l = list(s)
d = l.remove(max(l))

print(max(l))
