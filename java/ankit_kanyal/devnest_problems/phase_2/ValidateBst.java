// link- https://devsnest.in/algo-challenges/validate-binary-search-tree?tab=question

static int solve(TreeNode root){
    if(isValid(root,Long.MIN_VALUE,Long.MAX_VALUE))return 1;
    return 0;
}

static boolean isValid(TreeNode root,long least,long max){
    if(root==null) return true;
    if(root.left!=null&&(root.left.val>=root.val||root.left.val<=least)) return false;
    if(root.right!=null&&(root.right.val<=root.val||root.right.val>=max)) return false;
    return isValid(root.left,least,root.val)&&isValid(root.right,root.val,max);
}