// link- https://devsnest.in/algo-challenges/range-sum-of-bst?tab=question

static int solve(TreeNode root, int low, int high){

    if(root==null) return 0;
        
        
    if(root.val>=low && root.val<=high){
        return root.val+solve(root.left,low,high)+solve(root.right,low,high);
    }
        
    return solve(root.left,low,high)+solve(root.right,low,high);
}