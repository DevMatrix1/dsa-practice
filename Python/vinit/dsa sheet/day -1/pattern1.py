# pattern 1
'''for j in range(0,5):
    print("*"* 5)'''

# pattern 2
'''n=int(input())
for i in range(1,n+1):
    print("*"*i)'''

#pattern 3
'''n=int(input())
for i in range(1,n+1):
    for j in range(1,i+1):
        print(j,end="")
    print()'''

#pattern 4
'''n=int(input())
for i in range(1,n+1):
    for j in range(1,i+1):
        print(i,end="")
    print()'''

#pattern 5
n=int(input())
'''for i in range(1,n+1):
    for j in range(1,n+2-i):
        print("*",end="")
    print()'''
'''for i in range (n,0,-1):
    print((n-i)*''+i * '*' )'''

#pattern 6
n=int(input())
for i in range(1,n+1):
    for j in range(1,n+2-i):
        print(j,end="")
    print()

