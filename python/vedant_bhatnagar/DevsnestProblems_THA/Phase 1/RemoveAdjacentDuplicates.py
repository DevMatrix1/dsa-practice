def solve(s):
    # CODE HERE
    st = []
    for el in s:
        if len(st) > 0 and st[-1] == el:
            st.pop()
        else:
            st.append(el)
    return "".join(st)
    