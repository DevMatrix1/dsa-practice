def solve(M, N):
    # CODE HERE
    kat = []
    for i in range(1, M, 2):
        kat.append((i * ".|." ).center(N,"-"))
    
    kat.append("DEVSNEST!".center(N, "-"))

    for i in range(M-2, -1, -2):
        kat.append((i * ".|.").center(N,"-"))
    
    return kat
