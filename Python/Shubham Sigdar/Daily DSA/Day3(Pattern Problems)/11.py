strs=''
# print('1')
for i in range(5):
    strs=''
    for j in range(i+1,0,-1):
        if j%2==1:
            strs+='1'
        else:
            strs+='0'
    print(strs)
    

# 1 
# 01
# 101
# 0101
# 10101