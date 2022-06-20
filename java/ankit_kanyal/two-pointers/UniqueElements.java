// link- https://workat.tech/problem-solving/practice/unique-elements-sorted-array

class Solution {
	int removeDuplicates(int[] A) {
	    // add logic here
		int left=0;
		for(int right=0;right<A.length;right++){
			if(A[left]!=A[right]){
				A[++left]=A[right];
			}
		}
		return left+1;

	}
}