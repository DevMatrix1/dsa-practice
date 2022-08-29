import heapq
def solve(matrix, k):
    # CODE HERE
    h = []
    kat = []

    for i in range(len(matrix)):
        summ = sum(matrix[i])
        heapq.heappush(h, (summ, i))

    for i in range(k):
        a, idx = heapq.heappop(h)
        kat.append(idx)

    return kat 
