// https://devsnest.in/lms?id=47&slug=next-greater-element

vector<int> solve(int n, vector<int> nums){
//CODE HERE 
// code again
    int i;
    vector<int> ans(n, 0);
    stack<int> st;
    for (i = 2*n - 1; i >= 0; i--){
        while (!st.empty() && st.top() <= nums[i % n])
            st.pop();
        if (!st.empty()) {
            ans[i % n] = st.top();
        }
        else {
            ans[i % n] = -1;
        } 
        st.push(nums[i % n]);
    }
    return ans;
}
