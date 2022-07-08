// link- https://devsnest.in/algo-challenges/container-with-most-water

static int solve(int n, int[] arr){
//CODE HERE 

int low=0,high=n-1;
int maxArea=0,curArea=0;

while(low<high){
    curArea=Math.min(arr[low],arr[high])*(high-low);
    maxArea=Math.max(maxArea,curArea);
    if(arr[low]<arr[high]) low++;
    else high--;
}
return maxArea;
}