// link- https://devsnest.in/algo-challenges/recover-binary-search-tree?tab=question

static TreeNode pre;
static TreeNode first;
static  TreeNode second;
static TreeNode solve(TreeNode root){
     pre=null;
     first=null;
     second=null;

     inorder(root);
     int temp=first.val;
     first.val=second.val;
     second.val=temp;
    return root;   
}   
 public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        
        //find the first node which is at wrong position
        if(first==null && (pre==null ||pre.val>=root.val)){
            first = pre;
        }
        
        //find the second node which is at wrong position
        if(first!=null && pre.val>=root.val){
            second = root;
        }
        
        //store previus node to compare
        pre = root;
        inorder(root.right);
    }