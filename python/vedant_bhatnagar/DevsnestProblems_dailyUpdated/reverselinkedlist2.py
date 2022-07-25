def solve(head, left, right):
    # CODE HERE
    st = []
    if left == right:
        return head
    ptrnum = 1
    ptr = head
    while ptrnum != left:
        ptr = ptr.next
        ptrnum += 1
    while ptrnum <= right:
        st.append(ptr.data)
        ptrnum += 1
        ptr = ptr.next
    ptrnum = 1
    ptr = head
    while ptrnum != left:
        ptr = ptr.next
        ptrnum += 1
    while ptrnum <= right:
        data_el = st.pop()
        ptrnum += 1
        ptr.data = data_el
        ptr = ptr.next
    return head
    