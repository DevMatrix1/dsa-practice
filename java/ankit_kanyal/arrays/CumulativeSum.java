// link-https://workat.tech/problem-solving/practice/cumulative-sum

class Solution {
	int[] getCumulativeSum (int[] arr) {
		// add your logic here
		for(int i=1;i<arr.length;i++){
			arr[i]+=arr[i-1];
		}
		
		return arr;
	}
}