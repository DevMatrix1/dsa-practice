// link- https://devsnest.in/algo-challenges/array-building-from-permutation

static int[] solve(int n, int[] arr){
//CODE HERE 

    int nums[]=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=arr[arr[i]];
    }
    return nums;
}