public static class Pair 
{
	TreeNode node;
	int index;
	
	Pair(TreeNode node, int index)
	{
		this.node = node;
		this.index = index;
	}
}


static int solve(TreeNode root)
{
    if(root == null) return 0;
    
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(root, 0));
    int size, levelMinimum;
    int left = 0;
    int right = 0;
    int ans = 0;
    
    while(!queue.isEmpty())
    {
        size = queue.size();
        levelMinimum = queue.peek().index;
                    
        for(int i=0; i<size; i++)
        {
            Pair pair = queue.poll();
            TreeNode node = pair.node;
            int currentIndex = pair.index;
            
            
            if(i==0) left = currentIndex;
            if(i==size-1) right = currentIndex;
            
            if(node.left != null) queue.add(new Pair(node.left, 2*(currentIndex-levelMinimum)+1));
            if(node.right != null) queue.add(new Pair(node.right, 2*(currentIndex-levelMinimum)+2));
        }
        
        ans = Math.max(ans, right-left+1);
    }
    return ans;
}