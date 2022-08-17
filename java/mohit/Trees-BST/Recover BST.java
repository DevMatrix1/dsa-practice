static TreeNode prev = new TreeNode(Integer.MIN_VALUE);
static boolean adjacentSwap = true;
static TreeNode first, second;
	
static TreeNode solve(TreeNode root)
{
	recoverBST(root);

	int temp = first.val;
	first.val = second.val;
	second.val = temp;

	return root;

}

static void recoverBST(TreeNode root)
{
	if(root == null) return;
	
	recoverBST(root.left);
	
	if(root.val < prev.val) 
	{
		if(adjacentSwap)
		{
			first = prev;
			second = root;
			adjacentSwap = false;
		}
		else
		{
			second = root;
		}
	}
	
	prev = root;
	recoverBST(root.right);
}