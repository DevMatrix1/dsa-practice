

int solve(string str){
    stack<char> st;
    for(char ch: str){
        //If stack is non empty and the top element is an opening bracket and the current 
        //element is a closing bracket of same class (), {}, [], then just pop the top element
        if(!st.empty() and ((st.top()=='(' and ch == ')') || (st.top()=='{' and ch == '}') || (st.top()=='[' and ch == ']'))){
            st.pop();
        }
        //else if the stack is empty or current element is a opening bracket or just a closing bracket without a pair just push in stack
        else{
            st.push(ch);
        }
    }
    //If the stack remains non empty, means that the string was invalid
    if(!st.empty())
        return 0;
    return 1;
} 
