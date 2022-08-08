// link- https://devsnest.in/algo-challenges/sum-of-left-leaves?tab=question

static int solve(TreeNode root){
//CODE HERE 

int ans=0;
        
    if(root==null){
        return 0;
    }
    if(root.left!=null && root.left.left==null && root.left.right==null){
        ans+=root.left.val;
    }
    ans+=solve(root.left);
    ans+=solve(root.right);
        
    return ans;
}