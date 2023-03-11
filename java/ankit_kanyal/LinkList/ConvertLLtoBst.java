// link- https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return convert(head,null);
    }

    public TreeNode convert(ListNode head,ListNode tail){
        if(head==tail) return null;

        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=tail && fast.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        TreeNode thead=new TreeNode(slow.val);
        thead.left=convert(head,slow);
        thead.right=convert(slow.next,tail);
        return thead;
    }
}
