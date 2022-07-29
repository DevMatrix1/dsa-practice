def solve(head):
    # CODE HERE
    prev_node = next_node = None
    curr = head
    while curr != None:
        next_node = curr.next
        curr.next = prev_node
        prev_node = curr
        curr = next_node
    head = prev_node
    return head