// link- https://workat.tech/problem-solving/practice/merge-two-sorted-arrays

class Solution {
	int[] mergeSortedArrays(int[] A, int[] B) {
	    // add your logic here
		
		int i=0,j=0;
		int arr[]=new int[A.length+B.length];
		int index=0;
		while(i<A.length && j<B.length){
			if(A[i]<B[j]){
				arr[index]=A[i];
				i++;
			}
			else{
				arr[index]=B[j];
				j++;
			}
			index++;
		}
		if(i==A.length){
			while(index<arr.length){
				arr[index]=B[j];
				index++;j++;
			}
		}
		else if(j==B.length){
			while(index<arr.length){
				arr[index]=A[i];
				index++;i++;
			}
		}
		return arr;
	}
}