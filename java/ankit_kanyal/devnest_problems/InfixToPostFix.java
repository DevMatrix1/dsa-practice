static String solve(String infix){
//CODE HERE 
Stack<Character> stack=new Stack<>();
String result="";
for(char ch:infix.toCharArray()){
    if(Character.isLetterOrDigit(ch)){
        result+=ch;
    }

    else if(ch=='('){
        stack.push(ch);
    }

    else if (ch == ')'){
		while (!stack.isEmpty() &&
			stack.peek() != '('){
			result += stack.pop();
            }
		if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
	}

    else{
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        stack.push(ch);
    }

    while(!stack.isEmpty()){
        result+=stack.pop();
    }
    
}
return result;
}