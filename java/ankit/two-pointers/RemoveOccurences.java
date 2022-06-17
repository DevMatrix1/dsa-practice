// link- https://workat.tech/problem-solving/practice/remove-occurences

class Solution {

	public static void swap(int []A,int left,int right){
        int temp=A[left];
        A[left]=A[right];
        A[right]=temp;
    }

    int removeOccurences(int[] A, int k) {
        // add your logic here
        int left=0;
        int right=A.length-1;
        while(left<=right){
            if(A[left]==k){
                swap(A,left,right);
                right--;
            }
            else{
                left++;
            }
        }
        return left;
    }

}