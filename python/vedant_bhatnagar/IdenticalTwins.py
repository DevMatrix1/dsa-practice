class Solution:
	def getIdenticalTwinsCount(self, arr: List[int]) -> int:
		# add your logic here
		count = 0
		n = len(arr)
		for i in range(n):
			for j in range(i+1, n):
				if arr[i] == arr[j]:
					count = count+1
		return count



