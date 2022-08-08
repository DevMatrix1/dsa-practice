/**
 * link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 *  
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)    return null;

        int pval = Math.min(p.val, q.val);
        int qval = Math.max(p.val, q.val);
        
        if(pval <= root.val && root.val <= qval)
            return root;
        if(qval < root.val)
            return lowestCommonAncestor(root.left, p, q);
        if(root.val < pval)
            return lowestCommonAncestor(root.right, p, q);
        
        return null;
    }
}