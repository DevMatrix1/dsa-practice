# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        m = dict()
        ptr=head
        count=0
        if head==None:
            return head
        while ptr:
            if ptr not in m:
                m[ptr] = count
                count+=1
            else:
                return ptr
            ptr=ptr.next
        if ptr==None:
            return None
        
        #Floyd tortoise and hare algo for detecting cycle
        if not head or not head.next:
            return None
        ptr1=head
        ptr2=head.next
        while ptr1.next or ptr2.next.next:
                ptr1 = ptr1.next
                ptr2 = ptr2.next.next
                if ptr1 == ptr2:
                    return ptr1
        if ptr1==None or ptr2==None:
            return None

        fast = slow = head
        #floyd hare and tortoise algo
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                fast = head
                break
        #move fast and slow 1 1 place until they meet to reach the node where cycle begins
        if fast and fast.next:
            while fast != slow:     # if we need to remove cycle loop will be fast.next!=slow.next
                fast = fast.next
                slow = slow.next
            return fast             # then slow.next = None
        return None
            
            