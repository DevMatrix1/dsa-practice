// link- https://leetcode.com/problems/koko-eating-bananas/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long total=0;
        for(int i:piles){
            total+=i;
        }
        long low=1,high=total;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(canEat(piles,h,mid)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int)low;
    }
    
    public boolean canEat(int[] piles,int h,long speed){
        long days=0;
        for(int i:piles){
            days+=Math.ceil(i/(speed+0.0));
            
    
        }
        
        if(days<=h) return true;
        return false;
    }
}
