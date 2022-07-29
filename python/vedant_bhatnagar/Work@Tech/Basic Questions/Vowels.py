# Write your code here
vow = {"a", "e", "i", "o", "u", "A", "E","I", "O", "U"}

n = int(input())
count=0

for i in range(n):
	count=0
	name = input()
	for i in name:
		if i in vow:
			count+=1
	print(count)