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