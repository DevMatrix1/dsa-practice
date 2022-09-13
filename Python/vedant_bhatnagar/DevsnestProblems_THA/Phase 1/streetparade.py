def solve(n, order):
    # CODE HERE
    st = []
    ans = []
    for i in order:
        if not st:
            st.append(i)
            continue
        while st and st[-1]<i:
            ans.append(st.pop())
        st.append(i)
    
    if st:
        while st:
            ans.append(st.pop())
    # print(ans)
    for i in range(0, len(order)-1):
        if ans[i] > ans[i+1]:
            return 0
    return 1
        