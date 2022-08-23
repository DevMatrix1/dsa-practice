def solve(grid):
    count=0
    m,n= len(grid),len(grid[0])
    def connectIsland(x,y):
        
        grid[x][y] = 'M'
        Dir = [0,1,0,-1,0]
        for i in range(4):
            nx = x+Dir[i]
            ny = y+Dir[i+1]
            if 0<=nx<m and 0<=ny<n and grid[nx][ny]==1:
                        connectIsland(nx,ny)
            
    
    for row in range(m):
        for col in range(n):
            if grid[row][col]==1:
                    count+=1
                    connectIsland(row,col)
    
    
    
    return count 
def main():
    
    grid = [[1, 1, 1 ,1, 0],
    [1, 1, 0, 1, 0],
    [1, 1, 0, 0, 0],
    [0, 0, 0, 0 ,0]]
    
    
    print(solve(grid))
if __name__ == '__main__':
    main()
