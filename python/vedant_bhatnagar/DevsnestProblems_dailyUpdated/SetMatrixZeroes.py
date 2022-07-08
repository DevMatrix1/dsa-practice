def solve(a):
    m, n = len(a), len(a[0])
    r,c = False, False
    for j in range(n):
        if(a[0][j] == 0):
            r = True
            break
    for i in range(m):
        if(a[i][0] == 0):
            c = True
            break

    for i in range(m):
        for j in range(n):
            if a[i][j] == 0:
                a[i][0] = 0
                a[0][j] = 0

    for i in range(1,m):
        if(a[i][0] == 0):
            for j in range(1,n):
                a[i][j] = 0

    for j in range(1,n):
        if(a[0][j] == 0):
            for i in range(1,m):
                a[i][j] = 0

    if r:
        for j in range(n):
            a[0][j] = 0
    if c:
        for i in range(m):
            a[i][0] = 0

    return a


#using set approach

    row = set()
    col = set()
    m, n = len(a), len(a[0])
    for i in range(m):
        for j in range(n):
            if a[i][j] == 0:
                row.add(i)
                col.add(j)

    for i in row:
        for j in range(0,n):
            a[i][j] = 0

    for j in col:
        for i in range(0,m):
            a[i][j] = 0

    return a