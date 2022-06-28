// link- https://workat.tech/problem-solving/practice/matrix-search

class Solution {
	static boolean searchMatrix(int[][] matrix, int key){
        int left=0,right=matrix.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(search(matrix[mid],0,matrix[0].length-1,key)) return true;
            else if(key<matrix[mid][0]) right=mid-1;
            else left=mid+1;

        }
        return false;
    }

    static boolean search(int []arr,int low,int high,int key){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key) return true;
            else if(key<arr[mid]) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}