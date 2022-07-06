class Solution:
	def merge(self, arr: List[int], endIndex: int) -> List[int]:
		# add your logic here
		lptr = 0
		lptr_end = endIndex+1
		rptr = endIndex + 1
		rptr_end = len(arr)
		C = []
		
		while lptr < lptr_end and rptr < rptr_end:
			if arr[lptr] < arr[rptr]:
				C.append(arr[lptr])
				lptr+=1
			else:
				C.append(arr[rptr])
				rptr += 1
		
		while lptr < lptr_end:
			C.append(arr[lptr])
			lptr+=1
		
		while rptr < rptr_end:
			C.append(arr[rptr])
			rptr += 1
		return C



