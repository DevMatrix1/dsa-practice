def solve(s):
    # CODE HERE
    kat = {}
    for i , c in enumerate(s):
        kat[c] = i
    stk = []
    for idx, c in enumerate(s):
        if c not in stk:
            while stk and stk[-1]>c and kat[stk[-1]]>idx:
                stk.pop()
            stk.append(c)
    return "".join(stk)
