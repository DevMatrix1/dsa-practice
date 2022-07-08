// link- https://devsnest.in/algo-challenges/final-value-of-variable-after-performing-operations

static int solve(int n, String[] arr){
//CODE HERE 
int ans=0;
for(String string:arr){
    char start=string.charAt(0);
    char end=string.charAt(string.length()-1);
    if(start=='-'){
        --ans;
    }
    if(end=='-') ans--;
    if(start=='+') ++ans;
    if(end=='+') ans++;
     
}
return ans;
}