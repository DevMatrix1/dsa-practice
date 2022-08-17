// link- https://devsnest.in/algo-challenges/two-sum-iv-input-in-a-bst?tab=question

static HashSet<Integer> set=new HashSet<>();

static int solve(TreeNode root, int k){
//CODE HERE 
    if(root==null) return 0;
    if(set.contains(k-root.val)) return 1;
    set.add(root.val);
    return solve(root.left,k) | solve(root.right,k);
}