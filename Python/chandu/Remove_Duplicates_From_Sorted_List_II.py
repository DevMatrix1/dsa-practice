def solve(head):
    # CODE HERE
    if not head and not head.next:
        return head
    
    prev = Node(-1)
    prev.next = head
    head = prev
    itr = head.next
    while itr and itr.next:
        temp_data = itr.data
        temp_node = itr
        
        while temp_node and temp_node.data==temp_data:
            temp_node = temp_node.next
        
        if temp_node != itr.next:
            prev.next = temp_node
        
        else:
            prev = prev.next
        
        itr = temp_node
    return head.next
