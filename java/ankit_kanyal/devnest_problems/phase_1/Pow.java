// link- https://devsnest.in/algo-challenges/pow-x-n

static int solve(int x, int n){
//CODE HERE 
if(n==0) return 1;
if(n%2==0){
    return solve(x*x,n/2);
}
else{
    return solve(x*x,n/2)*x;
}


}

