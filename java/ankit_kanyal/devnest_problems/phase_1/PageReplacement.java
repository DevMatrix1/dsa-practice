// topic link - https://www.scaler.com/topics/operating-system/page-replacement-algorithm/

// https://devsnest.in/algo-challenges/page-replacement-algorithms

static int solve(int n, int[] pages, int capacity){
//CODE HERE 
List<Integer> queue=new ArrayList<>();
int faults=0;

for(int i=0;i<pages.length;i++){
    int page=pages[i];
    if(!queue.contains(page)){
        if(queue.size()<capacity){
            queue.add(page);
        }
        else if(queue.size()==capacity){
            index=index%capacity;
            queue.add(page);
            queue.remove(0);
        }
        faults++;
    }

}

return faults;
}