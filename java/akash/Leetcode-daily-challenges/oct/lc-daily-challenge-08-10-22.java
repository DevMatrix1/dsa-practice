// link: https://leetcode.com/problems/3sum-closest/description/
//approach - sorted the array. went through considering every possible combination


class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int indx = i;
            int l = 0;
            int r = n-1;
            int sum = nums[i];
            while(l < r){
                if(l == i){
                    l++;
                    continue;
                } else if(r == i){
                    r--;
                    continue;
                }

                int cur = sum + nums[l] + nums[r];
                int curAbs = Math.abs(cur - target);
                int ansAbs = Math.abs(ans - target);
                if(curAbs < ansAbs){
                    ans = cur;
                } 
                
                if(cur < target)
                   l++;
                else 
                   r--;
            }
        }

        return ans;
    }

}

//done!
