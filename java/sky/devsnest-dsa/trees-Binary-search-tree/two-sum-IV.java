/**
 * 
 * 
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

 // Approach 1: using list to store inorder of BST then applying two pointers to find if any combination exists or not.
//TC - O(2n), SC: O(2n) // O(n), O(n)

class Solution {
    public void inorder(TreeNode root, List<Integer> list){
        if(root == null)    return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int s = 0;
        int e = list.size()-1;
        while(s < e){
            int sum = list.get(s) + list.get(e);
            if(sum == k)
                return true;
            else if(sum < k)
                s++;
            else 
                e--;
        }
            
        return false;
    }
}


//Approach 2: Using hashset, adding elements at each node to set and checking at each node if (target - root.val) exists in set, if yes then return true else false. 
// TC: O(n), SC: O(n)

class Solution {
    public boolean inorder(TreeNode root, HashSet<Integer> set, int k){
        if(root == null)    return false;
        
        boolean left = inorder(root.left, set, k);
        
        boolean ans = false;
        if(set.contains(k - root.val))
            ans = true;
        set.add(root.val);
        
        boolean right = inorder(root.right, set, k);
        
        return ans || left || right;
    }
    public boolean findTarget(TreeNode root, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        return inorder(root, set, k);
    }
}

//Approach 3: Using binary search in tree to find (k - value) for current node and doing this for every node in the tree

class Solution {
    public boolean search(TreeNode root, TreeNode curr, int value){
        if(root == null) return false;
        if(curr != root){
            if(root.val == value)
            return true;
            if(root.val < value)
            return search(root.right, curr, value);
            return search(root.left, curr, value);
        }
        
        return false;
    }
    public boolean helper(TreeNode root, TreeNode curr, int k){
        
        if(curr == null)    return false;
        
        return search(root, curr, k-curr.val) || helper(root, curr.left, k) || helper(root, curr.right, k);
    }
    public boolean findTarget(TreeNode root, int k) {
        
        return helper(root, root, k);
    }
}