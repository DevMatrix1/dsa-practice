# Write your code here
n = int(input())
fact = 1
for i in range(n):
	fact=1
	data = int(input())
	if(data==0 or data==1):
		print(fact)
		continue
	while(data > 1):
		fact*=data
		data-=1
	print(fact)
	