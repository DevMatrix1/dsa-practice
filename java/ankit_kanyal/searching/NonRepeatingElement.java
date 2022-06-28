// link- https://workat.tech/problem-solving/practice/non-repeating-element

class Solution {
	int findNonRepeatingElement (int[] arr) {
		// add your logic here
		int left=0, right=arr.length-2;
    
    while(left<=right)
    {
        int mid = (left + right)/2;
        
        if(mid!=0 && arr[mid]==arr[mid-1])
        {
            if(mid%2==1) left = mid +1;
            else right = mid - 1;
        }
        
        else if(arr[mid]==arr[mid+1])
        {
            if(mid%2==1) right = mid - 1;
            else left = mid + 1;
        }
        else return arr[mid];

    }
    return arr[arr.length-1];
}
	
	
}