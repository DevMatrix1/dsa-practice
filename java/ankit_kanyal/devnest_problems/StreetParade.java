// https://devsnest.in/algo-challenges/street-parade

static int solve(int n, int[] order){
//CODE HERE 
Stack<Integer>st = new Stack<>();
int min = 0;

int flag = 0;

for(int i = 0;i<n-1;i++){

while(st.size()>0 && st.peek()<order[i]){

        st.pop();

    }

if(order[i]>order[i+1]){

    st.push(order[i]);

}
else if(order[i]<min){

    flag = 1;

    break;

}
else{

    min = order[i];

}
}

if(flag==1){

return 0;
}

else{

return 1;
} 
}