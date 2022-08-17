// link- https://devsnest.in/algo-challenges/path-sum?tab=question

static int solve(TreeNode root, int targetSum){
if (hasPathSum(root,targetSum)){
    return 1;
}
else{
    return 0;
}
}

public static boolean hasPathSum(TreeNode root, int targetSum) {

if (root == null)
    return false;

if(targetSum==root.val && root.left == null && root.right==null)

    return true;

return hasPathSum(root.right,targetSum-root.val)|| hasPathSum(root.left,targetSum-root.val);
}