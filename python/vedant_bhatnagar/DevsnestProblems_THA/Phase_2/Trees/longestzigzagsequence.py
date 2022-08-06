def findseq(root, k, isLeft):
    if root:
        if isLeft:
            return max(findseq(root.left, 1, True), findseq(root.right, k+1, False))
        else:
            return max(findseq(root.left, k+1, True), findseq(root.right, 1, False))
    return k-1

def solve(root):
    # CODE HERE
    return findseq(root, 0, True)