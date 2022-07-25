// link- https://devsnest.in/algo-challenges/valid-parentheses

static int solve(String str){
//CODE HERE 
Map<Character,Character> map=new HashMap<>();
map.put('}','{');
map.put(']','[');
map.put(')','(');

Stack<Character> stack=new Stack<>();
for(char bracket:str.toCharArray()){
    if(bracket=='(' || bracket=='{' || bracket=='['){
        stack.push(bracket);
    }
    else{
        if(stack.empty()) return 0;
        Character poppedElement=stack.pop();
        if(map.get(bracket)!=poppedElement) return 0;
    }
}
if(stack.empty()) return 1;
else return 0;
}