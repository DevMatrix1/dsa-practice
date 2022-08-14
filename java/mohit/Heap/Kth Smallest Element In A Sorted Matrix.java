/*
Time Complexity = O(n^2)
Space Complexity = O(k)

Can be imporved by using Binary Search.
*/

static int solve(int[][] matrix, int k)
	{
		//CODE HERE 
		PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{
				if(k > 0)
				{
					pq.add(matrix[i][j]);
					k--;
				}
				else
				{
					if(matrix[i][j] < pq.peek())
					{
						pq.remove();
						pq.add(matrix[i][j]);
					}
				}
			}
		}
		return pq.remove();
	}