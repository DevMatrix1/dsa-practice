def solve(str1):
	str2, list1 = "", []
	for i in str1:
		if not (i in str2):
			str2 = str2 + i
			list1.append(str1.count(i))
	return list1