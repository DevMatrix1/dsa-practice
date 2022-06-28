def solve(mat):
    # a = mat.pop(0)
    # print(mat)
    l2 = []
    mat.sort()
    l1 = [x[1] for x in mat]
    l1.sort()
    minscore = min(l1)
    for i in l1:
        if i != minscore:
            minscore = i
            break

    for i in mat:
        if minscore == i[1]:
            l2.append(i[0])

    return l2