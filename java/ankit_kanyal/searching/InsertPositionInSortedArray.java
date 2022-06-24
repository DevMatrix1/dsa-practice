// link- https://workat.tech/problem-solving/practice/insert-position-in-sorted-array

class Solution {
	int search(int [] arr,int key,int low,int high){
		if(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==key) return mid;
			if(arr[mid]<key && (mid==arr.length-1 || arr[mid+1]>key)){
				return mid+1;
			}
			else if(key<arr[mid]){
				return search(arr,key,low,mid-1);
			}
			return search(arr,key,mid+1,high);
		}
		return low;
	}
	
	int getInsertPosition (int[] arr, int key) {
		// add your logic here
		return search(arr,key,0,arr.length-1);
	}
}