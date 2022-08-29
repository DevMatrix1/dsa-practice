def solve(n, order):
    # CODE HERE
    stk = []
    kat = []
    count = 1
    for o in order:
        if count == o:
            kat.append(o)
            count += 1
        else:
            stk.append(o)
    
    if not stk or not kat:
        return 1
    
    while kat[-1]+1 == stk[-1] and count <= n:
        kat.append(stk.pop())
        count += 1
        if not stk:
            return 1
            
    return 0
