strs=''
for i in range(5,0,-1):
    num=65
    strs=''
    for i in range(i):
        strs=strs+chr(num)
        num+=1
    print(strs)

# ABCDE
# ABCD
# ABC
# AB
# A