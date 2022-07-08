// link- https://devsnest.in/algo-challenges/inserting-intervals

static int[][] solve(int[][] intervals, int n, int[] arr){

Arrays.sort(intervals,Comparator.comparingInt(x->x[0]));
int prevStart=intervals[0][0];
int prevEnd=intervals[0][1];
int startCount=1;
if(arr[0]<prevStart){
    prevStart=arr[0];
    prevEnd=arr[1];
    startCount=0;
}
ArrayList<ArrayList<Integer>> list=new ArrayList<>();
ArrayList<Integer> temp;

boolean isAdded=false;
for(int i=startCount;i<intervals.length;i++){
    int curStart=intervals[i][0];
    int curEnd=intervals[i][1];

    if(!isAdded && arr[0]<curStart && prevEnd<arr[1]){
        if(prevEnd<arr[0]){
            temp=new ArrayList<>();
          temp.add(prevStart);
          temp.add(prevEnd);
          prevStart=arr[0];
          prevEnd=arr[1];
          list.add(temp);
        }
        else{
            prevEnd=arr[1];
        }
        isAdded=true;
    }

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

int [][]ans=list.stream().map(l->l.stream().mapToInt(Integer::intValue).toArray()).toArray(int [][]::new);

return ans;
}