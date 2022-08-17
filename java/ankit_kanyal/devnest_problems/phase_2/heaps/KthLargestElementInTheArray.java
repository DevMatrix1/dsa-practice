// link- https://devsnest.in/algo-challenges/kth-largest-element-in-an-array?tab=question

static int solve(int n, int[] nums, int k){
//CODE HERE 
    PriorityQueue<Integer> minHeap=new  PriorityQueue<>();
        for(int i=0;i<k;i++){
            minHeap.add(nums[i]);
        }
        for(int i=k;i<n;i++){
            if(nums[i]>minHeap.peek()){
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        return minHeap.peek();
}