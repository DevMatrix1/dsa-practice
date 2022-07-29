class Solution:
	def getPositiveCumulativeSum(self, arr: List[int]) -> List[int]:
		# add your logic here
		sum,a = 0,[]
		for num in arr:
			num = num + sum
			sum = num
			if(sum > 0):
				a.append(sum)
		return a


