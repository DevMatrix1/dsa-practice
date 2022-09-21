/**
 * Link:- https://devsnest.in/algo-challenges/balanced-binary-tree?tab=question
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
static int height_of_tree(TreeNode root, int height){
    if(root != null){
        int l = height_of_tree(root.left, height+1);
        int r = height_of_tree(root.right, height+1);

        if(Math.abs(l - r) > 1)
            l = Integer.MAX_VALUE;
        
        return Math.max(l, r);
    }
    return height;
}
static int solve(TreeNode root){
//CODE HERE 
    return height_of_tree(root, 0) == Integer.MAX_VALUE? 0: 1;
}