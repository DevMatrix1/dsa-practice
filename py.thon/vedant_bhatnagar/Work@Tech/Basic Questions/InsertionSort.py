class Solution:
	def insertionSort(self, arr: List[int]) -> List[int]:
		# add your logic here
		if(len(arr) == 1):
			return arr
		
		n = len(arr)
		
		for wall in range(1, n):
			curr = arr[wall]
			pos = wall-1
			
			while pos>=0 and arr[pos]>curr:
				arr[pos+1] = arr[pos]
				pos = pos-1
			arr[pos+1] = curr
		return arr
				



