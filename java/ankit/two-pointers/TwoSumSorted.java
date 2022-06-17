// link- https://workat.tech/problem-solving/practice/two-sum-sorted

class Solution {
	boolean hasTwoSumZero (int[] arr) {
		// add your logic here
		int left=0,right=arr.length-1;
		while(left<right){
			int sum=arr[left]+arr[right];
			if(sum==0) return true;
			if(sum>0) right--;
			else left++;
		}
		return false;
	}
}