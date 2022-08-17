// link- https://devsnest.in/algo-challenges/search-in-a-binary-search-tree?tab=question

static TreeNode solve(TreeNode root, int target){
//CODE HERE 
    if(root==null) return new TreeNode(-1,null,null);
    
    if(root.val==target) return root;
    if(root.val>target){
        return solve(root.left,target);
    }else{
        return solve(root.right,target);
    }
}