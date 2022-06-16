// link- https://workat.tech/problem-solving/practice/inversion-count

class Solution {
	int getInversionCount(int[] arr) {
		// Add your logic here
		int swap=0;
		for(int i=1;i<arr.length;i++){
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
				swap++;
			}
			arr[j+1]=key;
		}
		return swap;
	}
	
}