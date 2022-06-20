// link-https://workat.tech/problem-solving/practice/dutch-national-flag

class Solution {
	
	
	void sortTheArray (int[] A) {
	    // add your logic here
		int length=A.length;
        int left=0,right=length-1;
        int index=0;
        while(index<=right){
            if(A[index]==0){
                A[index]=A[left];
                A[left]=0;
                left++;


            }

            else if(A[index]==2){
                A[index]=A[right];
                A[right]=2;
                right--;
				index--;

            }

                index++;
		}
		
	}
}