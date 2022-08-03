def count(head):
    ptr = head
    cnt = 0
    while ptr:
        ptr = ptr.next
        cnt+=1
    return cnt

def solve(head, k):
    # CODE HERE
    no_nodes = count(head)
    prev = None
    k = k%no_nodes
    if k == 0:
        return head
    if no_nodes == 0:
        return None
    prev = None
    ptr = head
    i = 1
    while i != (no_nodes-k):
        i += 1
        ptr = ptr.next
    prev = ptr
    tmp = ptr = ptr.next
    while ptr.next:
        ptr = ptr.next
    ptr.next = head
    prev.next = None
    head = tmp
    return head