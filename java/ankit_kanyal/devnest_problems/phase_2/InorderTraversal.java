// link- https://devsnest.in/algo-challenges/binary-tree-inorder-raversal?tab=question

public static List<Integer> list=new ArrayList<Integer>();

static int[] solve(TreeNode root){
//CODE HERE 
    Inorder(root);
    int [] ans=list.stream().mapToInt(Integer::intValue).toArray();
    return ans;

}

static void Inorder(TreeNode root){
    if(root==null) return;
    Inorder(root.left);
    list.add(root.val);
    Inorder(root.right);
    return ;
}