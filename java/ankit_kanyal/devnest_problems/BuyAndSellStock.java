// link- https://devsnest.in/algo-challenges/best-time-to-buy-and-sell-stock

static int solve(int n, int[] prices){
//CODE HERE 
int curProfit=0;
int maxProfit=0;
int buyDay=0,sellDay=0;
while(sellDay<n){
    curProfit=prices[sellDay]-prices[buyDay];
    if(curProfit>maxProfit) maxProfit=curProfit;
    if(curProfit<0){
        buyDay++;
        sellDay--;
    }
    sellDay++;
}

return maxProfit;
}