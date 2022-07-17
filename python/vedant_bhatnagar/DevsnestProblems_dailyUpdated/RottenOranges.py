def solve(grid):
    # CODE HERE
    rottenq = deque()
    m, n = len(grid), len(grid[0])
    fresh_oranges = 0

    for i in range(m):
        for j in range(n):
            if grid[i][j] == 1:
                fresh_oranges += 1
            if grid[i][j] == 2:
                rottenq.appendleft((i,j,0))
    
    if not fresh_oranges:
        return 0
    
    directions = {(1,0), (-1,0), (0,1), (0,-1)}
    while rottenq:
        ro_i, ro_j, time = rottenq.pop()
        for di, dj in directions:
            newo_i,newo_j = ro_i+di,ro_j+dj
            if -1<newo_i<m and -1<newo_j<n:
                if grid[newo_i][newo_j] == 1:
                    fresh_oranges -= 1
                    if not fresh_oranges:
                        return time+1
                    grid[newo_i][newo_j] = 2
                    rottenq.appendleft((newo_i,newo_j,time+1))
    return -1