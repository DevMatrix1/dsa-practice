// link- https://devsnest.in/algo-challenges/binary-tree-postorder-traversal?tab=question

public static List<Integer> list=new ArrayList<Integer>();

static int[] solve(TreeNode root){
//CODE HERE 
    PostOrder(root);
    int [] ans=list.stream().mapToInt(Integer::intValue).toArray();
    return ans;
}

static void PostOrder(TreeNode root){
    if(root==null) return;
    
    PostOrder(root.left);
    PostOrder(root.right);
    list.add(root.val);
    return ;
}