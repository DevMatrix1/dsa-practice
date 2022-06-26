// link- https://workat.tech/problem-solving/practice/search-rotated-array

class Solution {
	static int getElementIndex(int[] arr, int target) {
        // add your logic here
        int pivot=getPivotIndex(arr,0,arr.length-1);
        
        if (pivot == -1)
            return search(arr,target, 0, arr.length - 1);


        if (arr[pivot] == target)
            return pivot;
        if (arr[0] <= target)
            return search(arr, target,0, pivot - 1 );
        return search(arr,  target,pivot + 1, arr.length - 1);
    }

    static int getPivotIndex(int [] arr,int low,int high){
        if (high < low)
            return -1;
        if (high == low)
            return low;

        int mid = low + (high - low)/2 ;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return getPivotIndex(arr, low, mid - 1);
        return getPivotIndex(arr, mid + 1, high);
    }

    static int search(int arr[],int target,int low,int high){

        if(high<low) return -1;

            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }

            else if(target<arr[mid]){
                return search(arr,target,low,mid-1);
            }
            return search(arr,target,mid+1,high);
    }

    
}