// link- https://workat.tech/problem-solving/practice/implement-insertion-sort

class Solution {
	void insertionSort (int[] arr) {
		// add your logic here
		for(int i=1;i<arr.length;i++){
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
	}
}