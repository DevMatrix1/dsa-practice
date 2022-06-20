// link- https://workat.tech/problem-solving/practice/sorted-arrays-intersection

class Solution {
	List<Integer> intersection (int[] A, int[] B) {
		// add your logic here
		int left=0,right=0;
		List<Integer> list=new ArrayList<>();
		
		while(left<A.length && right<B.length){
			int leftElement=A[left];
			int rightElement=B[right];

			if(leftElement==rightElement){
				list.add(leftElement);
				left++;
				right++;
			}
			
			else if(leftElement<rightElement) left++;
			else right++;
		}
		
		
		return list;

	}
}