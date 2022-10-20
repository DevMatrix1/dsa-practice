# coded By Block_Cipher

# https://www.hackerrank.com/challenges/python-tuples/problem?isFullScreen=false

import re
n = int(input())
a = tuple(map(int,re.split(' ', input())))
print(hash(a))
