strs=''
for i in range(10):
    if(i%2==1):
        strs=''
        for j in range(i):
            strs+='*'
        print(strs)
for i in range(10,0,-1):
    if(i%2==1):
        strs=''
        for j in range(i):
            strs+='*'
        print(strs)
        
#      *
#     ***
#    *****
#   *******
#  *********  
#  *********
#   *******
#    *****
#     ***
#      *