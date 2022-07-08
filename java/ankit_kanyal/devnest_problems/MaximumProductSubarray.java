// link- https://devsnest.in/algo-challenges/maximum-product-subarray

// explanation link- https://leetcode.com/problems/maximum-product-subarray/discuss/1608800/C%2B%2B-or-Discussion-in-detail-or-Easy-to-understand

static int solve(int n, int[] arr){
//CODE HERE 
int leftProduct=1;
int rightProduct=1;
int prevProduct=1;
int maxProduct=Integer.MIN_VALUE;

for(int i=0;i<n;i++){
    leftProduct=leftProduct*arr[i];
    rightProduct=rightProduct*arr[n-1-i];
    
   maxProduct=Math.max(maxProduct,Math.max(leftProduct,rightProduct));
    if(leftProduct==0)leftProduct=1;
    if(rightProduct==0)rightProduct=1;
  
}


return maxProduct;
}