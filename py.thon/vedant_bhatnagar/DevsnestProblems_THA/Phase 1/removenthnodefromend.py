def count(head):
    cnt = 0
    ptr = head
    while ptr:
        ptr = ptr.next
        cnt += 1
    return cnt

def solve(head, n):
    # CODE HERE
    num = count(head)
    if n == num:
        head = head.next
        return head
    else:
        ptrnum = 1
        ptr = head
        prev = None
        travel = num - n
        while ptrnum <= travel:
            ptrnum += 1
            prev = ptr
            ptr = ptr.next
        prev.next = ptr.next
    return head 


#single pass

    p2 = p1 = head
    prev = None
    cnt = 1
    while cnt != (n):
        p1 = p1.next
        cnt += 1
    while p1.next:
        prev = p2
        p2 = p2.next
        p1 = p1.next
    if prev == None:
        return head.next
    else:
        prev.next = prev.next.next
    return head    