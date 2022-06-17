// link- https://workat.tech/problem-solving/practice/square-sorted-array

class Solution {
	int[] getSquareSortedArray (int[] arr) {
		// add your logic here
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]*arr[i];
		}
		Arrays.sort(arr);
		return arr;
	}
}