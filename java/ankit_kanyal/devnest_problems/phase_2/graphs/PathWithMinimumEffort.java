// link- https://devsnest.in/algo-challenges/path-with-minimum-effort?tab=question

//Explanation - https://leetcode.com/problems/path-with-minimum-effort/discuss/1036518/Java-3-clean-codes%3A-Dijkstra's-algo-Union-Find-Binary-search
 
 public static final int[][] dir = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };

static int solve(int[][] height){
//CODE HERE 
int m = height.length, n = height[0].length;
        int[][] dist = new int[m][n];
        for(int i = 0; i < m; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
        dist[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.add(new int[] {0, 0, 0});
        while(!pq.isEmpty()) {
            int[] p = pq.poll();
            int i = p[0], j = p[1];
            if(i == m - 1 && j == n - 1) break;
            for(int[] d: dir) {
                int x = i + d[0], y = j + d[1];
                if(x < 0 || x >= m || y < 0 || y >= n) continue;
                int alt = Math.max(p[2], Math.abs(height[i][j] - height[x][y]));
                if(alt < dist[x][y]) {
                    pq.add(new int[] {x, y, dist[x][y] = alt});
                }
            }
        }
        return dist[m - 1][n - 1];
}