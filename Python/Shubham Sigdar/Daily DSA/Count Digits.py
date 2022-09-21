# https://practice.geeksforgeeks.org/problems/count-digits5716/1

def evenlyDivides(N):
        n1=str(N)
        count=0
    # print(n1)
    # print(type(n1))
        for i in range(len(n1)):
            if int(n1[i])==0:
                continue
            elif N%int(n1[i])==0:
                count+=1
        return count
        
print(evenlyDivides(200))