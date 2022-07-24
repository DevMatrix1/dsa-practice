def solve(head):
    # CODE HERE
    st = []
    ptr = head
    while ptr != None:
        st.append(ptr.data)
        ptr = ptr.next
    
    ptr = head
    while st:
        el = st.pop()
        if ptr.data == el:
            ptr = ptr.next
        else:
            return 0
    return 1