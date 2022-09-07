import heapq

def solve(matrix, k):

    sums = []                          
    for i, row in enumerate(matrix):
         sums.append((sum(row), i))      
    sums.sort()                         
    return [y for x,y in sums[:k]] 