# Coded By Block_Cipher

# https://www.hackerrank.com/challenges/py-if-else/problem?isFullScreen=false


n = input('')
n = int(n)
if n%2==1:
    print('Weird')
elif  n == 2 or n == 4:
    print('Not Weird')
elif n>=6 and n<=20:
    print('Weird')
else:
    print('Not Weird')  