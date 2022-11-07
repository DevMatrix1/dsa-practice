# Q:https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/837876130/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy_head = ListNode(0)
        dummy_head.next = head
    
        slow, fast = dummy_head, head 

        for i in range(n):
            fast = fast.next 
        
        while fast:
            fast = fast.next
            slow = slow.next 
        
        slow.next = slow.next.next 
        return dummy_head.next