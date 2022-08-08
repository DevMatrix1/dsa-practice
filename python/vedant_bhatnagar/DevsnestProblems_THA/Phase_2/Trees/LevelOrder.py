def solve(root):
  q = deque([None,root])
  ans = [[root.val]]
  a = []
  while True:
    n = q.pop()
    if n:
      # print(n.val)
      if n.left:
        q.appendleft(n.left)
        a.append(n.left.val)
      if n.right:
        q.appendleft(n.right)
        a.append(n.right.val)
    else:
      if q:
        q.appendleft(None)
        ans.append(a)
        a = []
      else:
        break
  return ans