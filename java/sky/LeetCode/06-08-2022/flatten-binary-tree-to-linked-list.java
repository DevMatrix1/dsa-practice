//link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

/**
 * Approach 1: used a queue to keep preorder traversal of binary tree, then took one node at a time and given it's left == null and right == q.peek() i.e. next element in the queue
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
class Solution {
    private void preorder(TreeNode root, Queue<TreeNode> q){
        if(root == null)    return;
        q.offer(root);
        preorder(root.left, q);
        preorder(root.right, q);
    }
    public void flatten(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        preorder(root, q);
        
        while(q.size() > 0){
            TreeNode curr = q.poll();
            curr.left = null;
            curr.right = q.peek();
        }
    
    }
}


/**
 * Approach 2: bottom-up approach. keeping a prev pointer that is pointing towards the previous node to be connected to current node.right 
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
class Solution {
    private TreeNode prev = null;
    
    public void flatten(TreeNode root) {
        if(root == null)    return;
        
        flatten(root.right);
        flatten(root.left);
        
        root.left = null;
        root.right = prev;
        
        prev = root;
    }
}