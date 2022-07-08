// link- https://devsnest.in/algo-challenges/merge-intervals

static int[][] solve(int[][] intervals){
//CODE HERE 
if(intervals.length==1) return intervals;
Arrays.sort(intervals,Comparator.comparingInt(x->x[0]));
int prevStart=intervals[0][0],prevEnd=intervals[0][1];
int curStart,curEnd;

ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> temp;
for(int i=1;i<intervals.length;i++){
  curStart=intervals[i][0];
  curEnd=intervals[i][1];
//   if(prevEnd>=curEnd){
//       continue;
//   }
//   else 
    if(prevEnd<curEnd){
      if(prevEnd<curStart){
          temp=new ArrayList<>();
          temp.add(prevStart);
          temp.add(prevEnd);
          prevStart=curStart;
          prevEnd=curEnd;
          list.add(temp);
      }
      else{
          prevEnd=curEnd;
      }
  }
}
temp=new ArrayList<>();
temp.add(prevStart);
temp.add(prevEnd);
list.add(temp);

int [][] ans=list.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

return ans;

}