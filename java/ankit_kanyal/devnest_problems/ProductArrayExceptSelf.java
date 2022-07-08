// link- https://devsnest.in/algo-challenges/product-of-array-except-self

static int[] solve(int n, int[] arr){
//CODE HERE 
    int [] ans=new int[n];
    Arrays.fill(ans,1);

    for(int i=1;i<arr.length;i++){
        ans[i]=ans[i-1]*arr[i-1];
    }

    for(int i=n-2;i>=0;i--){
        arr[i]=arr[i]*arr[i+1];
    }

    for(int i=n-2;i>=0;i--){
        ans[i]=ans[i]*arr[i+1];
    }

    return ans;

}