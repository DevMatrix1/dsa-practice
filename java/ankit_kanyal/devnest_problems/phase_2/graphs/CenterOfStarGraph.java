// Basically, a center node will appear in every edge we just have to check that.

// link- https://devsnest.in/algo-challenges/find-center-of-star-graph?tab=question
static int solve(int[][] edges){
//CODE HERE 

    return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
}