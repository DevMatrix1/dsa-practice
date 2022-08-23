// link- https://devsnest.in/lms?id=57&slug=longest-zigzag-path-in-a-binary-tree&tab=question

static int solve(TreeNode root){
 int res=0;
        res=Math.max(ZigZag(root,false,0),ZigZag(root,true,0));
        return res-1;
    }
//     false=-left || true==right
 public static int ZigZag(TreeNode root,boolean status,int res){
        if(root==null ) return res;
        
        if(status==true){
            return Math.max(ZigZag(root.right,false,res+1),ZigZag(root.right,true,0));
        }else{
            return Math.max(ZigZag(root.left,true, res+1),ZigZag(root.left,false,0));
        }
}