def solve(n):
    str1, str2, list1 = "", "", []
    for i in range(1, n+1):
        for j in range(1, i+1):
            str1 = str1 + str(j)
        for k in range(j-1, 0, -1):
            str1 = str1 + str(k)
        list1.append(str1)
        str1 = ""
    return list1