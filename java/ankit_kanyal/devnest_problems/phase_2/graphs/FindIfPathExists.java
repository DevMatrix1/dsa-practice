// link- https://devsnest.in/algo-challenges/find-if-path-exists-in-graph?tab=question

static int solve(int n, int[][] edges, int source, int destination){
 Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i=0; i<n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }
        for (int i=0; i<edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        boolean[] visited = new boolean[n];
        boolean pathExists=dfs(graph, visited, source, destination);
        if(pathExists) return 1;
        return 0;
}
   public static boolean dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int source, int destination) {
        if (visited[source] == true) return false;
        if (source == destination) return true;
        visited[source] = true;
        for (Integer neighbour:graph.get(source)) {
            if (dfs(graph, visited, neighbour, destination)) return true;
        }
        return false;
    }