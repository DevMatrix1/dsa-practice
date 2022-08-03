def solve(s):
    # CODE HERE
    lastindex = {}
    for i, el in enumerate(s):
        lastindex[el] = i

    st = []
    present = set()
    for i, el in enumerate(s):
        if el in present:
            continue
        while st and st[-1] > el and lastindex[st[-1]] > i:
            t = st.pop()
            present.remove(t)
        st.append(el)
        present.add(el)
    return "".join(st)

