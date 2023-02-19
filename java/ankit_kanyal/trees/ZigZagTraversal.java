// link- https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

class Solution {
    public List<List<Integer>> ans;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ans=new ArrayList<>();
        int dir=1;
        Deque<TreeNode> queue=new ArrayDeque<>();
        List<Integer> sub;
        if(root==null) return ans;
        queue.add(root);
        while(queue.peek()!=null){
            int n=queue.size();
            sub=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=queue.remove();
                sub.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        if(dir!=1) Collections.reverse(sub);
        dir=-dir;
        ans.add(sub); 
        }
        return ans;
    }
}
