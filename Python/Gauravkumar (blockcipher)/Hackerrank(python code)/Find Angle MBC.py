# coded By Block_Cipher

# https://www.hackerrank.com/challenges/find-angle/problem

import math 
a = int(input())
b = int(input())



m = math.sqrt(a**2+b**2)
the = math.acos(b/m)
print(str(round(math.degrees(the)))+u'\N{DEGREE SIGN}' )


