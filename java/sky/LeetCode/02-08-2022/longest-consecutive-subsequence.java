//link:- https://leetcode.com/problems/longest-consecutive-sequence/

//Approach 1: using a HashSet
class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int ans = 0;
        int count = 0;
        for(int num: nums){
            if(!set.contains(num-1)){
                count = 1;
                while(set.contains(++num)){
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }
        
        return ans;
    }
}

//Approach 2: using MinHeap(PriorityQueue)
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