def count(head):
    cnt = 0
    ptr = head
    while ptr:
        ptr = ptr.next
        cnt += 1
    return cnt
def solve(head):
    # CODE HERE
    n = count(head)
    mid = n//2+1
    ptr = head
    ptrnum = 1
    while ptrnum != mid:
        ptr = ptr.next
        ptrnum += 1
    return ptr