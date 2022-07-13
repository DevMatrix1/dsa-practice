// link- https://devsnest.in/algo-challenges/final-prices-with-a-special-discount

static int[] solve(int n, int[] prices){

for(int i=0;i<n-1;i++){
    int cur=i+1;
    while(cur<n && prices[i]<prices[cur]){
        cur++;
    }
    if(cur!=n){
        prices[i]=prices[i]-prices[cur];
    }

}

return prices;
}