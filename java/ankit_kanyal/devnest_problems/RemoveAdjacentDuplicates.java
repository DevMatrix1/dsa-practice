// link- https://devsnest.in/algo-challenges/removing-all-adjacent-dupicates-in-a-string

static String solve(String s){
//CODE HERE 
Stack<Character> stack=new Stack<>();

int count=s.length();
for(char character:s.toCharArray()){
    if(stack.empty() || stack.peek()!=character){
        stack.push(character);
    }
    else{
        stack.pop();
        count--;
    }
}


String ans="";
while(!stack.empty()){
    ans=stack.pop()+ans;
}
return ans;
}