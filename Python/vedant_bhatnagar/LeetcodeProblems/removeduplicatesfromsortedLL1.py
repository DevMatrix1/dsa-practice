# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        p = head
        l = r = head
        if not l or not l.next:
            return l
        while r:
            if l.val == r.val:
                r = r.next
            else:
                l.next = r
                l = r
        l.next = None
        return 