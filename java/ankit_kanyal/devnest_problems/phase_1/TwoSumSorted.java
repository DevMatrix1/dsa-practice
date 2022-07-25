// link- https://devsnest.in/algo-challenges/two-sum-ii

static int[] solve(int n, int[] arr, int target){
//CODE HERE 
int start=0,end=n-1;
while(start<end){
    int sum=arr[start]+arr[end];
    
    if(sum==target) return new int[]{start+1,end+1};
    else if(sum<target){
        start++;
    }
    else end--;
}
return new int[]{-1,-1};
}