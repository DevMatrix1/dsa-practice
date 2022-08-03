def solve(M, N):
    # CODE HERE
    list1 = []
    str1=""
    count=1
    mid = (M//2) + 1
    for i in range(1, M+1):
        if(i == mid):
            for a in range((N-9)//2):
                str1 = str1+"-"
            str1 = str1+"DEVSNEST!"
            for b in range((N-9)//2):
                str1 = str1+"-"
        else:    
            for j in range((N - 3*count)//2):
                str1 = str1+"-"
            for k in range(count):
                str1 = str1+".|."
            for l in range((N - 3*count)//2):
                str1 = str1+"-"
        
        if(i<mid-1):
            count=count+2
        elif(i == mid-1 or i == mid):
            count=count+0;
        else:
            count=count-2
        list1.append(str1)
        str1=""
    return list1