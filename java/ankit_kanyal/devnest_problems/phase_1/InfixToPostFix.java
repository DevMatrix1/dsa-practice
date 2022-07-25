static int precedence(char c){

switch (c){
    case '+':
    case '-':
        return 1;
    case '*':
    case '/':
        return 2;
    case '^':
        return 3;

}

return -1;
}

static String solve(String infix){

//CODE HERE

String result = "";

Stack<Character> stack = new Stack<>();

for (int i = 0; i <infix.length() ; i++) {
    char c = infix.charAt(i);

//check if char is operator
    if(precedence(c)>0){
        while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
            result += stack.pop();
        }
        stack.push(c);

    }else if(c==')'){
        char x = stack.pop();
        while(x!='('){
            result += x;
            x = stack.pop();
        }
    }else if(c=='('){
        stack.push(c);

    }else{
    //character is neither operator nor ( 
        result += c;
    }
}

for (int i = 0; i <=stack.size() ; i++) {
    result += stack.pop();

}

return result;
}