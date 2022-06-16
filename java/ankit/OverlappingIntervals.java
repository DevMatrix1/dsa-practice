// link- https://workat.tech/problem-solving/practice/merge-overlap-intervals

class Solution {
	int[][] mergeIntervals(int[][] intervals) {
        // add your logic here
        int [][] merge=new int[intervals.length][2];
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        
        int prevStart=intervals[0][0];
        int prevEnd=intervals[0][1];
        int curIndex=0;
        merge[curIndex][0]=prevStart;
        merge[curIndex][1]=prevEnd;

        for(int i=1;i<intervals.length;i++){

            int curStart=intervals[i][0];
            int curEnd=intervals[i][1];
            if(prevEnd<curStart){
                
                curIndex++;
                merge[curIndex][0]=curStart;
                merge[curIndex][1]=curEnd;
            }
            else if(prevEnd<curEnd){
                merge[curIndex][1]=curEnd;
            }
            prevStart=merge[curIndex][0];
            prevEnd=merge[curIndex][1];
        }

        int[][] ans=Arrays.copyOf(merge,curIndex+1);
        return ans;
    }
}