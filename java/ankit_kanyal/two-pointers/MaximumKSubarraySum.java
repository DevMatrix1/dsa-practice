// link- https://workat.tech/problem-solving/practice/maximum-k-subarray-sum

class Solution {
	int maxKSubarraySum (int[] A, int k) {
		// add your logic here
		int left=0,right=k-1;
		int[] cummlativeSum=new int[A.length];

		cummlativeSum[0]=A[0];
		for(int i=1;i<A.length;i++){
			cummlativeSum[i]=cummlativeSum[i-1]+A[i];
		}
		int maxSum=0;
		while(right<A.length){
			int curSum=cummlativeSum[right]-cummlativeSum[left]+A[left];
			maxSum=Math.max(curSum,maxSum);
			left++;
			right++;
		}
		
		return maxSum;
	}
}