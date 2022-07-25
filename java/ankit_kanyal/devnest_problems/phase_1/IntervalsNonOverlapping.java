// link- https://devsnest.in/algo-challenges/intervals-non-overlapping

static int solve(int[][] interval){
//CODE HERE 
    Arrays.sort(interval,Comparator.comparingInt(x->x[0]));
    int prevStart=interval[0][0],prevEnd=interval[0][1];
    int curStart,curEnd;
    int n=interval.length;
    int count=0;
    for(int i=1;i<interval.length;i++){
        curStart=interval[i][0];
        curEnd=interval[i][1];

        if(curStart<prevEnd){
            count++;
            prevEnd=Math.min(curEnd,prevEnd);
        }
        else prevEnd=curEnd;
        
    }
    
    return count;
}