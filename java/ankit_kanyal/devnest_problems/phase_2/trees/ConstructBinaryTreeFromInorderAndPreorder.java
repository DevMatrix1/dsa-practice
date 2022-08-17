// link- https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        
        return root;
        
    }
    
    TreeNode buildTree(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,Map<Integer,Integer> map){
        
        if(preStart>preEnd || inStart>inEnd) return null;
        
        TreeNode root=new TreeNode(preorder[preStart]);
        
        int inRootPos=map.get(root.val);
        
        int numsLeft=inRootPos-inStart;
        
        root.left=buildTree(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inRootPos-1,map);
        
        root.right=buildTree(preorder,preStart+numsLeft+1,preEnd,inorder,inRootPos+1,inEnd,map);
        
        return root;
        
    }
}