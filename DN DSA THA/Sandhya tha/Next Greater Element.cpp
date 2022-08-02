 
vector<int> solve(int n, vector<int> nums){

    vector<int> res(n);
    stack<int> st;
    for(int i=2*n-1;i>=0;i--)
    {
        while(!st.empty() && nums[i%n]>=st.top())
                st.pop();
        
            if(st.empty()) res[i%n] = -1;
            else res[i%n] = st.top();
        
        st.push(nums[i%n]);
    }
    return res;
}
