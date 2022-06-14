// link- https://workat.tech/problem-solving/practice/implement-quicksort

class Solution {
	
	public static void swap(int [] arr,int swap1,int swap2){
		int temp=arr[swap1];
		arr[swap1]=arr[swap2];
		arr[swap2]=temp;
	}
	
	public static int partition(int [] arr,int low,int high){
		int pivot=arr[high];
		
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	
	public static void sort(int[] arr,int low,int high){
		if(low<high){
			int pi=partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}
	void quickSort (int[] arr) {
		// add your logic here
		int low=0,high=arr.length-1;
		sort(arr,low,high);
	}
}