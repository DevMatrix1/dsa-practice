/** 
 * Link:- https://leetcode.com/problems/binary-tree-pruning/
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//Approach 1
// class Solution {
//     public boolean helper(TreeNode root){
//         if(root != null){
//             boolean curr = root.val == 1;
//             boolean l = helper(root.left);
//             boolean r = helper(root.right);
            
//             if(!curr && !l && !r){
//                 return false;
//             }
           
//             if(l == false)
//                 root.left = null;
            
//             if(r == false)
//                 root.right = null;
            
//             return true;
//         }
            
//         return false;
//     }   
    
//     public TreeNode pruneTree(TreeNode root) {
//         boolean ifroot = helper(root);
//         return ifroot? root: null;
//     }    
// }

//Approach 2
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null)
            return null;
        
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        
        return (root.val == 0 && root.left == null && root.right == null)? null: root;
    }    
}