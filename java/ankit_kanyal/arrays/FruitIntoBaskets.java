// link- https://leetcode.com/problems/fruit-into-baskets/

class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length<=2) return fruits.length;
        int max = 2;
        int prev = fruits[1];
        int prevPrev = fruits[0];
        int prevSum = fruits[0]==fruits[1]?2:1;
        int localSum = 2;
        for(int i=2;i<fruits.length;++i) {
            if(fruits[i]!=prev) {
                if(fruits[i]!=prevPrev) localSum = prevSum;
                prevPrev = prev;
                prevSum = 0;
            }
            localSum++;
            prev = fruits[i];
            prevSum++;
            max = Math.max(localSum, max);
        }
        return max;
    }
}
