// link- https://devsnest.in/algo-challenges/maximum-possible-product-after-k-operations?tab=question

static int solve(int n, int[] nums, int k){
//CODE HERE 
Queue<Integer> queue = new PriorityQueue<>();
        for(int i: nums) queue.offer(i);
        for(int i=0;i<k;i++) queue.offer(queue.poll()+1);
        long prod = 1;
        int mod = 1_000_000_007;
        while(!queue.isEmpty()) prod = (prod*queue.poll())%mod;
        return (int)prod;
}