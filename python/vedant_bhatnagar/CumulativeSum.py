class Solution:
	def getCumulativeSum(self, arr: List[int]) -> List[int]:
		# add your logic here
		sum = 0
		for i in range(len(arr)):
			arr[i] = sum + arr[i]
			sum = arr[i]
		return arr


