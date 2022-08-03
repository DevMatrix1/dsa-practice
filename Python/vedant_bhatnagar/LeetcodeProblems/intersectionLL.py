# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        s = set()
        while headA:
            s.add(headA)
            headA = headA.next
        while headB:
            if headB in s:
                return headB
            headB = headB.next
        return None
        

        #O(1) space solution
        #go to end of 1 LL and point it to head of L2
        #then use LL cycle detection algo
        ptrA = headA
        while ptrA.next:
            ptrA=ptrA.next
        ptrA.next = headB
        fast = slow = headA
        while fast and fast.next:
            fast = fast.next.next
            slow=slow.next
            if fast==slow:
                fast=headA
                break
        if fast and fast.next:
            while fast!=slow:
                fast=fast.next
                slow=slow.next
            return fast
        return None