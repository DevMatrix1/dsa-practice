//Link - https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix


class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int []arr: matrix){
            for(int num: arr){
                pq.add(num);
            }
        }
                
        while(k>1){
            pq.poll();
            k--;
        }
                
        return pq.poll();
    }
}

