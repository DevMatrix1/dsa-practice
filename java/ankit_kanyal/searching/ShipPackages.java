// link- https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0,low=0;
        for(int i:weights){
            high+=i;
            low=Math.max(low,i);
        }
        int ans=high;
        while(low<high){
            System.out.println("Before: "+"low: "+low+" high: "+high);
            int mid=low+(high-low)/2;
            if(canShip(weights,days,mid)){
                ans=mid;
                high=mid;
                System.out.println("mid: "+mid+"low: "+low+" high: "+high);
            }
            else {
                low=mid+1;
            }
            System.out.println("After: "+"mid: "+mid+" low: "+low+" high: "+high);
        }
        
        return ans;
    }

    public boolean canShip(int[] weights,int days,int capacity){
        int countD=0;
        int currentFill=0;
        for(int i:weights){
            currentFill+=i;
            if(currentFill>=capacity){
                countD++;
                if(currentFill==capacity) currentFill=0;
                else currentFill=i;
            }
    
        }
        if(currentFill!=0) countD++;
        if(countD<=days) return true;
        return false;
    }
}
