// link- https://devsnest.in/algo-challenges/increasing-order-search-tree?tab=question

static TreeNode curr;

static TreeNode solve(TreeNode root){
   TreeNode first = new TreeNode(-1);
        
    //assign first
    curr = first;
        
	//depth first search
    dfs(root);
        
    return first.right;
}
static void dfs(TreeNode node){
        if(node == null) return;
        
        //go to left child
        dfs(node.left);
        
        //create a new node, and assign to right
        curr.right = new TreeNode(node.val);
        
        //move the current pointer
        curr = curr.right;
        
        dfs(node.right);
    }