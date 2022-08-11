static int solve(int n, int[] nums, int k)
{
    //CODE HERE 
    PriorityQueue <Integer> pq = new PriorityQueue<>();
    for(int i=0; i<n; i++)
    {
        if(i < k) pq.add(nums[i]);
        else if (nums[i] > pq.peek()) 
        {
            pq.poll() ;
            pq.add(nums[i]);
        }
    }
    return pq.peek();
}