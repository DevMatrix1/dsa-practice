// link- https://devsnest.in/algo-challenges/rain-water-harvesting

static int solve(int n, int[] height){
//CODE HERE 

int [] left=new int[n];
int [] right=new int[n];

left[0]=height[0];
right[n-1]=height[n-1];

// Arrays.fill(left,height[0]);
// Arrays.fill(right,height[n-1]);

 for(int i=1;i<n;i++){
    left[i]=Math.max(height[i],left[i-1]);   
    right[n-i-1]=Math.max(height[n-i],right[n-i]);
}


int maxArea=0;

for(int i=1;i<n-1;i++){
    int min=Math.min(left[i],right[i]);
    if(min>height[i]){
        maxArea=maxArea+min-height[i];
    }
}

return maxArea;
}