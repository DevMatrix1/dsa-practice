// link- https://workat.tech/problem-solving/practice/search-range

class Solution {

	static int first(int [] arr,int key,int left,int right){
        if(right>=left){
			int mid=left+(right-left)/2;
			if((mid==0 || key>arr[mid-1]) && arr[mid]==key){
				return mid;
			}
			else if(key<=arr[mid]){
				return first(arr,key,left,mid-1);
			}
			return first(arr,key,mid+1,right);
		}
		return -1;
    }

	static int last(int [] arr,int key,int left,int right){
        if(right>=left){
			int mid=left+(right-left)/2;
			if((mid==arr.length-1 || key<arr[mid+1]) && arr[mid]==key){
				return mid;
			}
			else if(key<arr[mid]){
				return last(arr,key,left,mid-1);
			}
			return last(arr,key,mid+1,right);
		}
		return -1;
    }


	
	int[] searchRange (int[] arr, int key) {
		// add your logic here
		int left=first(arr,key,0,arr.length-1);
		int right=last(arr,key,0,arr.length-1);
		
		return new int[]{left,right};
	}
}