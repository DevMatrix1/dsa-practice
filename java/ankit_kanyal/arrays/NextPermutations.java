// link- https://leetcode.com/problems/next-permutation/

class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
    int cur=n-2;
if(n==1) return ;
while(cur>=0 && nums[cur]>=nums[cur+1]){
    cur--;
}

if(cur>=0){
        int j=nums.length-1;
        while(nums[j]<=nums[cur]) j--;
        swap(nums,cur,j);
    }
    reverse(nums,cur+1,nums.length-1);

return ;
}

static void swap(int []nums,int first,int second){
    int temp=nums[first];
    nums[first]=nums[second];
    nums[second]=temp;
}

static void reverse(int [] nums,int first,int second){
    while(first<second){
        swap(nums,first++,second--);
    }
}
}
