// link- https://devsnest.in/algo-challenges/sum-of-1d-array

static int[] solve(int n, int[] nums){
//CODE HERE 
int curSum=nums[0];
for(int i=1;i<n;i++){
    curSum+=nums[i];
    nums[i]=curSum;
}

return nums;
}