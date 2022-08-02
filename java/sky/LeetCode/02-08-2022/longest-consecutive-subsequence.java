//link:- https://leetcode.com/problems/longest-consecutive-sequence/
//solved using MinHeap(PriorityQueue)

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num: nums){
            minHeap.add(num);
        }
        
        int ans = 1;
        int prev = minHeap.poll();
        int count = 1;
        while(minHeap.isEmpty() == false){
            int curr = minHeap.poll();
            if(curr == prev)
                continue;
            if(curr == prev+1){
                count++;
            }
            else     
                count = 1;
            
            ans = Math.max(count, ans);
            prev = curr;
        }
        
        return ans;
    }
}