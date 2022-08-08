static int ans=0;

static int diameter(TreeNode root){

 if(root==null)return -1;
        
        int L=diameter(root.left);
        int R=diameter(root.right);
        //ans signfies(no. of nodes farthest apart) or the DIAMETER
        ans=Math.max(ans,L+R+2);
        //height of the tree is max of LST & RST +1
        return 1+Math.max(L,R);
}

static int solve(TreeNode root){

if(root==null )return 0;
    diameter(root);
    return ans;
}