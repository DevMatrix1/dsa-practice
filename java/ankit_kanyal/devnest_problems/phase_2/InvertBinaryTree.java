// link- https://devsnest.in/algo-challenges/invert-binary-tree?tab=question

static TreeNode solve(TreeNode root){
//CODE HERE 
    Invert(root);
    return root;
}

static void Invert(TreeNode root){
    if(root==null) return;
    TreeNode temp=root.left;
    root.left=root.right;
    root.right=temp;
    Invert(root.left);
    Invert(root.right);
}