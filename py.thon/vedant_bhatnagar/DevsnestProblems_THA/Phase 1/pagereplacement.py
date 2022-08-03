def solve(n, pages, capacity):
    # CODE HERE
    track = set()
    mem = deque()
    fault = 0
    for i in pages:
        if i in track:
            continue
        fault+=1
        if len(mem) == capacity:
            page = mem.pop()
            track.remove(page)
            mem.appendleft(i)
            track.add(i)
        else:
            mem.appendleft(i)
            track.add(i)
    return fault
    