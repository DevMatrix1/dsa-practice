// link- https://workat.tech/problem-solving/practice/contains-element

class Solution {
	
	static boolean binarySearch(int [] arr,int key,int left,int right){
		
		if(left<=right){
			int mid=left+(right-left)/2;
			if(key==arr[mid]){
				return true;
			}
			if(arr[mid]>key){
				return binarySearch(arr,key,left,mid-1);
				
			}
			
			return binarySearch(arr,key,mid+1,right);
				
		
		}
		return false;
	}
	boolean containsElement (int[] arr, int key) {
		// add your logic here

		return binarySearch(arr,key,0,arr.length-1);
	}
}