// link- https://devsnest.in/algo-challenges/kth-smallest-element-in-a-sorted-matrix?tab=question

// help link- https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/discuss/1322101/C%2B%2BJavaPython-MaxHeap-MinHeap-Binary-Search-Picture-Explain-Clean-and-Concise

// Heap approach 
// Complexity:
// Time: O(M * N * logK), where M <= 300 is the number of rows, N <= 300 is the number of columns.
// Space: O(K), space for heap which stores up to k elements.

static int solve(int[][] matrix, int k){
//CODE HERE 
int rows=matrix.length;
        int columns=matrix[0].length;
        
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((o1,o2)->Integer.compare(o2,o1));
        
        for(int row=0;row<rows;row++){
            for(int column=0;column<columns;column++){
                maxHeap.offer(matrix[row][column]);
                if(maxHeap.size()>k) maxHeap.poll();
            }
        }
        
        return maxHeap.peek();
}


// Binary Seach solution-



static int m,n;

static int solve(int[][] matrix, int k){
//CODE HERE 
m = matrix.length; n = matrix[0].length; // For general, the matrix need not be a square
        int left = matrix[0][0], right = matrix[m-1][n-1], ans = -1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (countLessOrEqual(matrix, mid) >= k) {
                ans = mid;
                right = mid - 1; // try to looking for a smaller value in the left side
            } else left = mid + 1; // try to looking for a bigger value in the right side
        }
        return ans;
    }
static int countLessOrEqual(int[][] matrix, int x) {
        int cnt = 0, c = n - 1; // start with the rightmost column
        for (int r = 0; r < m; ++r) {
            while (c >= 0 && matrix[r][c] > x) --c;  // decrease column until matrix[r][c] <= x
            cnt += (c + 1);
        }
        return cnt;
}