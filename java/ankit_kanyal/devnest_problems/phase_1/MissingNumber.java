// link- https://devsnest.in/algo-challenges/missing-number

static int solve(int n, int[] arr){
//CODE HERE 
int sum=n*(n+1)/2;
int total=0;
for(int i:arr) total+=i;
return sum-total;
}