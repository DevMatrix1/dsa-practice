// link- https://devsnest.in/algo-challenges/binary-tree-preorder-traversal?tab=question

public static List<Integer> list=new ArrayList<Integer>();

static int[] solve(TreeNode root){
//CODE HERE 
    PreOrder(root);
    int [] ans=list.stream().mapToInt(Integer::intValue).toArray();
    return ans;
}

static void PreOrder(TreeNode root){
    if(root==null) return;
    list.add(root.val);
    PreOrder(root.left);
    PreOrder(root.right);
    return ;
}