#pattern 7
'''n=int(input())
for i in range(1,n+1):
    print(" "*(n-i),end="")
    for j in range (1,i+1):
        print("*",end=" ")
    print()'''

#pattern 8
'''n=int(input())5
for i in range(1,n+1):
    print(" " * (i-1),end="")
    for j in range(1,n+2-i):
        print("*", end=" ")
    print()'''

#pattern 9
'''n=int(input())
for i in range(1,n+1):
    print(" "*(n-i),end="")
    for j in range(1, i + 1):
        print("*", end=" ")
    print()
for p in range(1,n):
    print(" " *p,end="")
    for q in range(1,n+1-p):
        print("*", end=" ")
    print()
'''

 #pattern 10
'''n=int(input())
for i in range(n):
    for j in range(i + 1):
        print('*', end="")
    print()
for i in range(n):
    for j in range(n - i - 1):
        print('*', end="")
    print()'''


