// link- https://workat.tech/problem-solving/practice/next-greater-permutation

class Solution {
	
	public static void swap(int []arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

public static void reverse(int []arr,int i,int j){
		while(i<j){
			swap(arr,i++,j--);
		}
	}
	void nextGreaterPermutation (int[] arr) {
		// add your logic here
	int index=arr.length-2;
		while(index>=0 && arr[index]>=arr[index+1]){
			index--;
		}
		if(index>=0){
			int j=arr.length-1;
			while(arr[j]<=arr[index]) j--;
			swap(arr,index,j);
		}
		reverse(arr,index+1,arr.length-1);
	}
}