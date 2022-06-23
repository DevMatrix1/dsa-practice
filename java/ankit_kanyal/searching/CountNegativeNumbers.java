// link- https://workat.tech/problem-solving/practice/negative-numbers-in-sorted-array

class Solution {
	
	static int search(int []arr,int low,int high){
		if(low<high){
			int mid=low+(high-low)/2;
			if (arr[mid] < 0 && arr[mid + 1] >= 0) {
           return mid;
       } else if (arr[mid] >= 0 ) {
           return search(arr, 0, mid);
       } else {
           return search(arr, mid + 1, high);
       }
			
	}
		return -1;
	}
	int getNegativeNumbersCount (int[] arr) {
		// add your logic here
		if(arr[0] >= 0) {
		   return 0;
	   		}
	   	if(arr[arr.length-1] < 0) {
		   return arr.length;
	   		}
		return search(arr,0,arr.length-1)+1;
	}
}