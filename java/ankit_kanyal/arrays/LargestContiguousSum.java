// link- https://workat.tech/problem-solving/practice/largest-contiguous

class Solution {
	int largestContiguousSum(int[] arr){
		int maxSum=Integer.MIN_VALUE,curSum=0;
		
		for(int i=0;i<arr.length;i++){
			curSum+=arr[i];
			maxSum=Math.max(curSum,maxSum);
			if(curSum<0) curSum=0;
		}
		return maxSum;
	}
}