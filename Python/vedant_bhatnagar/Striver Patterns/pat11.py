i = 1
for j in range(1, 6):
  if j % 2==1:
    i = 1
  else:
    i = 0
  for k in range(1, j+1):
    print(i, end=" ")
    if i == 1:
      i = 0
    else:
      i = 1
  print()
