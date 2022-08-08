// link- https://devsnest.in/algo-challenges/kth-smallest-element-in-bst?tab=question

static int solve(TreeNode root, int k){
   ArrayList<Integer> list=new ArrayList<>();
   helper(root,list);

   return list.get(k-1);
}
public static void helper(TreeNode root,ArrayList<Integer> list){
    if(root==null) return ;

    helper(root.left,list);
    list.add(root.val);
    helper(root.right,list);
}