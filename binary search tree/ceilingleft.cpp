//ceiling left means element on the left side which is greater or equal to element

using namespace std;
#include <iostream> 
#include <set>

void ceilingL(int arr[], int n){
    set<int> s;
    cout<<"-1";
    s.insert(arr[0]);
    for(int i = 1; i < n; i++){
        if(s.lower_bound(arr[i])!= s.end()) cout<<*(s.lower_bound(arr[i]))<<" ";
        else cout<<"-1";
        s.insert(arr[i]); 
    }
}

int main(){
 
}