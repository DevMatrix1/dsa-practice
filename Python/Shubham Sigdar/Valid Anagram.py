def solve(s1, s2):
    m1={}
    m2={}
    for i in range(len(s1)):
        if s1[i] not in m1:
            m1[s1[i]]=1
        else:
            m1[s1[i]]+=1
    for i in range(len(s2)):
        if s2[i] not in m2:
            m2[s2[i]]=1
        else:
            m2[s2[i]]+=1
    if m1==m2:
        return 1
    else:
        return 0