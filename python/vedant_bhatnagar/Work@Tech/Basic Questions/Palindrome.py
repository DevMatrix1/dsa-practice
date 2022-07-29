# Write your code here
n = int(input())

for i in range(n):
	word = input()
	if(word == word[::-1]):
		print("True")
	else:
		print("False")