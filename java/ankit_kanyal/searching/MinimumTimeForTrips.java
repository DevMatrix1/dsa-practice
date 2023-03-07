// link- https://leetcode.com/problems/minimum-time-to-complete-trips/

class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min=time[0];
        for(int i:time){
            min=Math.min(min,i);
        }
        long low=1,high=min*totalTrips;
        System.out.println(high);
        while(low<=high){
            long mid=low+(high-low)/2;
            if(canComplete(time,totalTrips,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public boolean canComplete(int[] time,int totalTrips,long givenTime){
        long noOfTrips=0;
        for(int i:time){
            long trips=givenTime/i;
            noOfTrips+=trips;
        }
        if(noOfTrips>=totalTrips) return true;
        return false;
    }
}
