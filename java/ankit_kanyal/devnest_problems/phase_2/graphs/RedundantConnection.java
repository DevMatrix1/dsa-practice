// Explanation- https://leetcode.com/problems/redundant-connection/discuss/1295728/JS-Python-Java-C%2B%2B-or-Simple-Union-Find-Solution-w-Explanation

// link- https://devsnest.in/algo-challenges/redundant-connection?tab=question
static int[] par;

static int[] solve(int[][] edges){
 par = new int[edges.length+1];
        for (int i = 0; i < par.length; i++)
            par[i] = i;
        for (int[] e : edges)
            if (find(e[0]) == find(e[1])) return e;
            else union(e[0],e[1]);
        return edges[0];
    }
    
    static int find(int x) {
        if (x != par[x]) par[x] = find(par[x]);
        return par[x];
    }
    static void union(int x, int y) {
        par[find(y)] = find(x);
    }