# Write your code here
n = int(input())
for i in range(n):
	str = ""
	data = input()
	for j in data:
		if(j.islower()):
			str += j.upper()
		else:
			str+= j.lower()
	print(str)