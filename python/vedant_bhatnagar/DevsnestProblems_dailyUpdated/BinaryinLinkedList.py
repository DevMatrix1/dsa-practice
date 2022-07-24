def solve(head):
    # CODE HERE
    st = []
    while head != None:
        st.append(head.data)
        head = head.next
    dec_num = 0
    power = 0
    while st:
        dec_num += st.pop()*(2**power)
        power+=1
    return dec_num
