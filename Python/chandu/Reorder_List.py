def solve(head):
    # CODE HERE
    # slow and fast pointer
    slow, fast = head, head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
    
    sec_head = slow.next
    slow.next = None
    
    # revere the second linked list
    prev = None
    itr = sec_head
    while itr:
        temp = itr.next
        itr.next = prev
        prev = itr
        itr = temp
    
    # merging two linked list
    l1, l2 = head, prev
    while l2:
        temp1, temp2 = l1.next, l2.next
        l1.next = l2
        l2.next = temp1
        l1 = temp1
        l2 = temp2
        
    return head
