// Dummy Node
static TreeNode curr = new TreeNode(-1);
static TreeNode ans = curr;

static TreeNode solve(TreeNode root)
{
    inorder(root);
    return ans.right;
}

static void inorder(TreeNode root)
{
    if(root == null) return;
    
    inorder(root.left);
    
    curr.right = root;
    root.left = null;
    curr = curr.right;
    
    inorder(root.right);
}