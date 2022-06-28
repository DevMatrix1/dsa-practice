# Write your code here
n = int(input())
sum = 0
for i in range(n):
	sum = 0
	data = input()
	for i in data:
		sum += int(i)
	print(sum)