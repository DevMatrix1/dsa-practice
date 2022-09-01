import heapq
def solve(n, tasks, k):
    # CODE HERE
    hashmap = {}
    for i in tasks:
        if i in hashmap:
            hashmap[i] += 1
        else:
            hashmap[i] = 1
    
    mx_heap = [-x for x in hashmap.values()]
    heapq.heapify(mx_heap)

    tm = 0
    q = deque()

    while mx_heap or q:
        tm += 1

        if mx_heap:
            lap = 1 + heapq.heappop(mx_heap)

            if lap:
                q.append([lap, tm + k])
        
        if q and q[0][1] == tm:
            heapq.heappush(mx_heap, q.popleft()[0])
        

    return tm
