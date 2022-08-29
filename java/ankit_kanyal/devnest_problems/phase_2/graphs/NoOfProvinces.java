// link- https://devsnest.in/lms?id=65&slug=number-of-provinces

static int solve(int[][] isConnected){
//CODE HERE 
    //DFS
        //The whole premise is to maintain a count of province and we only increment the count when we call dfs on an unvisited city.
        //Cities that are reachable from city A will be marked visited while doing a dfs call from the city A & we will not do dfs calls from these visited cities.
        //Thus not impacting the count variable
        
        int cities = isConnected.length;
        //Maintain an array of visited cities
        boolean[] vis = new boolean[cities];
        //instantiate count variable
        int count = 0;
        //Iterate through the cities
        for (int i = 0; i < cities; i++){
            //If the current city is visited, then reject and move on
            if (vis[i])
                continue;
            //else increment the count of province
            count++;
            //mark this true -> Can be done inside the dfs method as well
            vis[i] = true;
            //Call DFS
            dfs(i, isConnected, vis);
        }
        //return the province count
        return count;
}

 static void dfs(int src, int[][] isConnected, boolean[] vis){
        //get the nested array using the parent array and src as the index
        int[] nbrArr = isConnected[src];
        //iterate over the nested array
        for (int idx = 0; idx < nbrArr.length; idx++){
            //No linking between src and neighbor, i.e isConnected[i][j] = 0
            //or the neighboring city is visited
            //or the src is the neighboring city
            //then we reject and move on
            if (nbrArr[idx] == 0 || vis[idx] || idx == src)
                continue;
            //else we mark this as visited & apply dfs on it's nested array
            vis[idx] = true;
            dfs(idx, isConnected, vis);
        }
    }