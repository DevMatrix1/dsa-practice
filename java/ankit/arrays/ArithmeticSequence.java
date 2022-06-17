// link- https://workat.tech/problem-solving/practice/arithmetic-sequence

class Solution {
	boolean isArithmeticSequence (int[] arr) {
		// add your logic here
		Arrays.sort(arr);
		int diff=arr[1]-arr[0];
		for(int i=1;i<arr.length-1;i++){
			if(arr[i+1]-arr[i]!=diff){
				return false;
			}
		}
		return true;
	}
}