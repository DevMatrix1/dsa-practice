'''#all divisor
n=int(input())
for i in range(1,n+1):
    if(n%i)==0:
        print(i ,end='')
        '''
#prime number
'''def primecheck(n):
    if n>1:
        for i in range(2,int(n/2)+1):
            if(n%i)==0:
                print(n,'is not prime number')
                break
        else:
            print(n,'is a prime number')
    else:
        print(a,'is not prime')

n=int(input())
primecheck(n)
    '''