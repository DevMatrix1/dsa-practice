// link- https://workat.tech/problem-solving/practice/k-diff-pairs

class Solution {
	int kDiffPairs (int[] A, int k) {
		// add your logic here
		int left=0,right=1;
		int count=0;
		int length=A.length;
		while(right<length){
			while(right<(length-1) && A[right]==A[right+1]){
				right++;
			}
			
			int diff=A[right]-A[left];
			
			if(diff==k){
				count++;
				left++;
				right++;
			}
			
			else if(diff<k){
				right++;
			}
			
			else{
				left++;
			}
			
			if(left==right) right++;
		}
	
		
		

		return count;
	}

}