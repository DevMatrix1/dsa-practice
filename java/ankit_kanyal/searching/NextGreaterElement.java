// link- https://workat.tech/problem-solving/practice/next-greater-element-in-sorted-array

class Solution {
	
	public static int search(int []arr,int key,int low,int high){
		if(low<high){
			int mid=low+(high-low)/2;
			if(arr[mid]==key && arr[mid+1]>key ){
				return arr[mid+1];
			}
			else if(key<arr[mid]){
				return search(arr,key,low,mid);
				
			}
			else{
				return search(arr,key,mid+1,high);
			}
		}
		return arr[low];
	}
	int getNextGreaterElement (int[] arr, int key) {
		int n = arr.length;
		if (arr[n - 1] <= key) {
			return key;
		}
		return search(arr,key,0,arr.length-1);
	}
}
