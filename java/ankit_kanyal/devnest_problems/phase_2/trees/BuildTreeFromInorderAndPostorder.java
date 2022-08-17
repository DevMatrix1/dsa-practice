// link- https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/submissions/

static int n;

static TreeNode solve(int n1, int[] inorder, int n2, int[] postorder){
//CODE HERE 
n=inorder.length-1;
Map<Integer,Integer> map=new HashMap<>();
for(int i=0;i<inorder.length;i++){
    map.put(inorder[i],i);
}

TreeNode root=constructTree(inorder,postorder,map,0,inorder.length-1);

return root;
}

static TreeNode constructTree(int[] inorder,int[]postorder,Map<Integer,Integer> map,int start,int end){
    if(n<0) return null;
    if(start>end) return null;

    TreeNode root=new TreeNode(postorder[n]);

    int position=map.get(root.val);
    n--;

    root.right=constructTree(inorder,postorder,map,position+1,end);
    root.left=constructTree(inorder,postorder,map,start,position-1);
    
        
    return root;
}