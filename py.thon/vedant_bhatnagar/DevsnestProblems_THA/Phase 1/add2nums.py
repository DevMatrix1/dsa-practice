def solve(l1, l2):
    # CODE HERE
    carry = 0
    ans = p = Node(123)
    while l1 and l2:
        k = l1.data + l2.data + carry
        carry = k//10
        p.next = Node(k%10)
        p, l1, l2 = p.next, l1.next, l2.next
    if l2:
        l1 = l2
    while l1:
        k = l1.data + carry
        carry = k//10
        p.next = Node(k%10)
        p, l1 = p.next, l1.next
    if carry:
        p.next = Node(carry)
    return ans.next