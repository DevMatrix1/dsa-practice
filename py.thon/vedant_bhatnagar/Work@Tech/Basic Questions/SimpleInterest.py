# Write your code here
data = input().split(" ")
for i in range(len(data)):
	data[i] = float(data[i])

SI = 1.0
for i in data:
	SI *= i

SI = SI/100.0

print("%.6f" % SI)