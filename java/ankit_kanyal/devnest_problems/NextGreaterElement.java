// link- https://devsnest.in/algo-challenges/next-greater-element

static int[] solve(int n, int[] nums){
//CODE HERE 
int ans[]=new int[n];
Arrays.fill(ans,-1);
Stack<Integer> stack=new Stack<>();

for(int i=0;i<2*n;i++){

    int index=i%n;
    while(!stack.empty() && nums[stack.peek()]<nums[index]){
        ans[stack.pop()]=nums[index];
    }
    stack.push(index);
}


return ans;
}