// link- https://devsnest.in/algo-challenges/maximum-sum-subarray

static int solve(int n, int[] arr){
//CODE HERE 
int curSum=0;
int maxSum=Integer.MIN_VALUE;

for(int i:arr){
    curSum+=i;
    if(curSum>maxSum) maxSum=curSum;
    if(curSum<0) curSum=0;
    
}
return maxSum;
}