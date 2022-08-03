// link- https://devsnest.in/algo-challenges/sum-of-root-to-leaf-binary-numbers?tab=question

static int sum;

static int solve(TreeNode root){
//CODE HERE 
    sum=0;
    helper(root,0);
    return sum;


}

public static void helper(TreeNode root,int n){
    if(root==null) return;

    if(root.left==null && root.right==null){
        n=n*2;
        n+=root.val;
        sum+=n;
        return;
    }
    n=n*2;
    n+=root.val;
    helper(root.left,n);
    helper(root.right,n);
}