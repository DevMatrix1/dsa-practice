l = 6
for i in range(1,5):
  for j in range(1,i+1):
    print(j, end="")
  for k in range(1,l+1):
    print("", end=" ")
  l-=2
  for j in range(i,0,-1):
    print(j,end="")
  print()