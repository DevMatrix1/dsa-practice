// link- https://leetcode.com/problems/jump-game-ii/

class Solution {
    public int jump(int[] nums) {
        //if length of array is 1 only it means we are already at our destination, since we have to go till n-1, so 1-1=0, hence step=0;
        if(nums.length==1)return 0;
        //length of array
        int n=nums.length;
         //variable that stores maximum jump we can make from an index
        int maxJump=0;
          
         //variable that will keep track of position after making maximum jump 
        int currPosAfterMaxJump=0;
         
         //variable that count number of steps
        int steps=0;
       
       for(int i=0;i<n-1;i++){
           //maximum jump we can make from i
           maxJump=Math.max(maxJump,i+nums[i]);
           
           //if we are have reached current position after maximum jump then it means we need to take one step more
           //and we will update our currPosAfterMaxJump
           if(currPosAfterMaxJump==i){
              steps++;
              currPosAfterMaxJump=maxJump;
            }
            //check if we have reached destination
            if(currPosAfterMaxJump>=n-1)return steps;

       }

      return steps;
    }
}
