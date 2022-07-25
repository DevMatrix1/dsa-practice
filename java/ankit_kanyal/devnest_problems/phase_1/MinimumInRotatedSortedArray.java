// link- https://devsnest.in/algo-challenges/minimum-in-rotated-sorted-array

static int solve(int n, int[] arr){
//CODE HERE 
int firstElement = arr[0], left=0, right=arr.length-1;
int ans=arr[0];
    while(left<right)
    {
        int middle = left+(right-left)/2;
        if(arr[middle]<firstElement){
            right=middle-1;
            ans=arr[middle];
        }
        else{
            left=middle+1;
        }
             
    }

    if(arr[left]<=ans) return arr[left];
    else return ans;
}