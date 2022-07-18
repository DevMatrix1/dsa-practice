def gcd(a,b):
    if b==0:
        return a
    return gcd(b, a%b)

def solve(n, deck):
    # CODE HERE
    m = {}
    if n<2:
        return 0
    for i in deck:
        if i in m:
            m[i] += 1
        else:
            m[i] = 1
    
    track = list(m.values())
    curr_gcd = track[0]
    for i in track:
        if curr_gcd>i:
            curr_gcd = gcd(curr_gcd, i)
        else:
            curr_gcd = gcd(i,curr_gcd)
    if curr_gcd > 1:
        return 1
    else:
        return 0