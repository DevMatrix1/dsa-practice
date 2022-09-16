'''pattern-16
A 
BB 
CCC 
DDDD
EEEEE'''

'''n=int(input())
for i in range(1,n+1):
    for j in range(1,i+1):
        print(chr(i+64),end='')
    print()'''

'''pattern-17
5
   A 
  ABA
 ABCBA
ABCDCBA'''

'''m=4  
for i in range(65,70):
    m=m-1
    for j in range(m,1,-1):
        print(" ",end="")
    for k in range(65,i+1):
        print(chr(k),end="")
    for n in range(65,i):
        print(chr(n),end="")
    print()'''


'''
pattern-18
E
DE
CDE
BCDE 
ABCDE''' 

'''n=5 
for i in range(1,n+1):
    for j in range(1,i+1):
        print(chr(n+64+j-i),end="")
    print()'''

'''pattern-19 
**********
****  ****
***    ***
**      **
*        *
**      ** 
***    *** 
****  **** 
**********'''
'''n=int(input())
for i in range(n,0,-1):
    for j in range(i,0,-1):
        print("*",end=" ")
    for j in range(2*(n-i)):
        print(" ",end=" ")
    for j in range(i,0,-1):
        print("*",end=" ")
    print()
for i in range(1,n):
    for j in range(i+1):
        print("*",end=" ")
    for j in range(2*(n-i-1)):
        print(" ",end=" ")
    for j in range(i+1):
        print("*",end=" ")
    print()
        '''

'''pattern-20 
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *'''
'''n=int(input())
for i in range(-n, n+1):
    for j in range(1,(n+1)-abs(i)+1):
       print("*",end="")
    for j in range(1,(2)*abs(i)+1):
       print(" ",end="")
    for j in range(1,(n+1)-abs(i)+1):
       print("*",end="")
    print()
'''
#-2
'''n = int(input())
for i in range(1, n+1):
    print("*"*i, end="")
    print(" "*(n-i)*2, end="")
    print("*"*i)
for i in range(n, 0, -1):
    print("*"*i, end="")
    print(" "*(n-i)*2, end="")
    print("*"*i)'''

'''pattern-21
****
*  *
*  *
*  *
****'''
'''rows = int(input("Enter rows"))
cols = int(input("Enter Cols"))
for i in range(0, rows):
    for j in range(0, cols):
        if i==0 or j==0 or i == rows-1 or j == cols-1:
            print("*", end="")
        else:
            print(" ", end="")
    print()'''

'''pattern-22
4 4 4 4 4 4 4 
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
'''
'''n=int(input())
k=(2*n)-1
low=0
high=k-1
value=n
matrix=[[0 for i in range(k)]for j in range(k)]
for i in range(n):
    for j in range(low,high+1):
        matrix[i][j]=value
    for j in range(low+1,high+1):
        matrix[j][i]=value
    for j in range(low+1,high+1):
        matrix[high][j]=value
    for j in range(low+1,high):
        matrix[j][high]=value
    
    low=low+1  
    high=high-1 
    value=value-1
for i in range(k):
    for j in range(k):
        print(matrix[i][j],end=" ")
    print()'''
 