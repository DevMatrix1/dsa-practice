def solve(n, pages, capacity):
    # CODE HERE
    pq = []
    count = 0

    for i in pages:
        if len(pq) == capacity and i not in pq:
            pq.pop(0)
            pq.append(i)
            count += 1
        elif len(pq) < capacity and i not in pq:
            pq.append(i)
            count += 1
    
    return count
