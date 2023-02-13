// link- https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

class Solution {
    public int countOdds(int low, int high) {
        int count =(high-low)/2;
        if(low%2==1) count++;
        if(high%2==1) count++;
        if(low%2==1 && high%2==1) count--;
        return count;
    }
}
