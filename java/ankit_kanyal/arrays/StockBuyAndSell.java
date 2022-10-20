// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int cur=prices[0];
        int next=1;
        int profit=0;
        while(next<prices.length){
            int curProfit=prices[next]-cur;
            if(curProfit>profit){
                profit=curProfit;
            }
            cur=Math.min(cur,prices[next]);
            next++;
        }
        return profit;
        
    }
}
