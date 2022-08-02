vector<string> solve(int n){

    queue<string>q;
    q.push("1");
    vector<string>res;
    for(int i = 0 ; i < n  ; i++){
        string s = q.front();
        res.push_back(s);
        q.pop();
        q.push(s+"0");
        q.push(s+"1");
    }
    return res;
}