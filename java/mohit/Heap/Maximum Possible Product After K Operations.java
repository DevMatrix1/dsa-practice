static int solve(int n, int[] nums, int k)
	{
		//CODE HERE 
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// O(nlogn)
		for(int i: nums)
		{
			pq.add(i);
		}
		
		for (int i = 0; i < k; i++) 
		{
			pq.add(pq.remove()+1);
		}
		
		long ans = 1;
		
		while(!pq.isEmpty())
		{
			ans = (ans*pq.remove()) % 1000000007;
		}
		
		return (int)ans;
	}