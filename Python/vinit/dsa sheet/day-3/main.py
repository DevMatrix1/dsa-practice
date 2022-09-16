# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
#pattern 11
#n=int(input())
'''for i in range(1,n+1):
    for j in range(1,i+1):
        if (j%2==0):
            print("0",end=' ')
        else:
            print("1",end=' ')
    print()
'''

#pattern12
n=int(input())

#pattern13
'''n=int(input())
num=1
for i in range(0,n+1):
    for j in range(i+1):
        print(num,end=" ")
        num+=1
    print()'''
    
 #pattern14
'''n=int(input())
for i in range(n):
    for j in range(i+1):
        print(chr(j + 65), end="")
    print()
'''

#pattern 15
'''n=int(input())
for i in range (n+65,65,-1):
    # inner loop for jth columns
    for j in range(65,i):
        print(chr(j),end="")
    print()'''