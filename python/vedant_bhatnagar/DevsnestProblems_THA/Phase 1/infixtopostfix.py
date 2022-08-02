def solve(infix):
    # CODE HERE
    postfix = ""
    op = {"+":1, "-":1, "*":2, "/":2, "^":3}
    st = []
    for i in infix:
        # print(i)
        if i not in op and i != "(" and i != ")":
            postfix += i
            continue
        if i == "(":
            st.append(i)
            continue
        if i == ")":
            # print(st)
            while st[-1] != "(":
                el = st.pop()
                postfix+=el
            st.pop()
            continue
        if i in op:
            while st:
                st_top = st[-1]
                if st_top == "(":
                    st.append(i)
                    break
                else:
                    if op[st_top] >= op[i]:
                        postfix += st_top
                        st.pop()
                    else:
                        st.append(i)
                        break
            if len(st) == 0:
                st.append(i)
    while st:
        postfix += st.pop()
    return postfix