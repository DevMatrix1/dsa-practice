// link- https://workat.tech/problem-solving/practice/k-subarray-sum

class Solution {
	int[] kSubarraySum (int[] A, int k) {
		// add your logic here
	int [] cummlativeSum=new int[A.length];
		int curSum=0;
		for(int i=0;i<A.length;i++){
			curSum+=A[i];
			cummlativeSum[i]=curSum;
		}
		int result[]=new int[A.length-k+1];

		int left=0,right=k-1;
		while(right<A.length){
		
			int sum=cummlativeSum[right]-cummlativeSum[left]+A[left];
			result[left]=sum;
			left++;
			right++;
			
		}
		return result;
	}
}