// link- https://devsnest.in/algo-challenges/two-sum

static int[] solve(int n, int[] nums, int target){
//CODE HERE 
Map<Integer,Integer> map=new HashMap<>();
int [] ans=new int[2];
for(int i=0;i<nums.length;i++){
    int remainder=target-nums[i];
    if(map.containsKey(remainder)){
        ans[0]=map.get(remainder);
        ans[1]=i;
        
    }
    else{
        map.put(nums[i],i);
    }
}
return ans;
}