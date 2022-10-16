# link - leetcode.com/problems/delete-the-middle-node-of-a-linked-list/submissions/

# First solution - using slow and fast pointers

class Solution(object):
    def deleteMiddle(self, head):
        if not head.next:
            return None
        if not head.next.next:
            head.next = None
            return head
        
        fast = head
        slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow=slow.next
        
        slow.val = slow.next.val
        slow.next=slow.next.next
        
        return head
      
      
#  Second solution - counting the numbers of nodes and finding the middle node.

class Solution(object):
    def deleteMiddle(self, head):
        def count(head):
            ptr = head
            count = 0
            if not ptr:
                return 0
            while ptr:
                count += 1
                ptr = ptr.next
            return count
        
        n = count(head)
        if n==1: 
            return None
        if n==2:
            head.next=None
            return head
        mid = n//2
        ptr = head
        count = 0
        while count != mid:
            count+=1
            ptr=ptr.next
        
        if ptr.next:
            ptr.val = ptr.next.val
            ptr.next = ptr.next.next
        return head
