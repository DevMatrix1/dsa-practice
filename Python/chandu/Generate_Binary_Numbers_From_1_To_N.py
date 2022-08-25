def solve(n):
    # CODE HERE
    pq = deque()
    kat = []
    pq.appendleft(1)
    for i in range(n):
        temp = pq.pop()
        pq.appendleft(str(temp) + "0")
        pq.appendleft(str(temp) + "1")
        kat.append(temp)
    return kat
