// link- https://devsnest.in/algo-challenges/3sum

static int[][] solve(int n, int[] nums){

ArrayList<ArrayList<Integer>> list=new ArrayList<>();
Arrays.sort(nums);
for(int i=0;i<n;i++){
    int remainingTarget=-nums[i];
    int start=i+1,end=n-1;
    ArrayList<Integer> triplet;
    while(start<end){
        int twoSum=nums[start]+nums[end];
        if(twoSum<remainingTarget) start++;
        else if(twoSum>remainingTarget) end--;
        else{
            triplet=new ArrayList<>();
            triplet.add(nums[i]);
            triplet.add(nums[start]);
            triplet.add(nums[end]);

            list.add(triplet);
            while(start<end && nums[start]==triplet.get(1)) start++;
            while(start<end && nums[end]==triplet.get(2)) end--;
        }
    }
    while(i+1<=nums.length-1 && nums[i] == nums[i+1]) i++;
}

int [][] ans=list.stream().map(l->l.stream().mapToInt(Integer::intValue).toArray()).toArray(int [][]::new);

return ans;
}