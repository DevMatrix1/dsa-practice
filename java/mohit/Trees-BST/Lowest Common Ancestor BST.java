static TreeNode solve(TreeNode root, int p, int q)
{
        return LCA(root, Math.min(p, q), Math.max(p, q));
}

static TreeNode LCA(TreeNode root, int p, int q)
{
    if((p < root.val && root.val < q) || (p == root.val && root.val < q) || (p < root.val && root.val == q)) return root;
    
    else if(q < root .val) return LCA(root.left, p, q);
    
    else return LCA(root.right, p, q);
}