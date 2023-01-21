// link- https://workat.tech/problem-solving/practice/implement-stack-array

// Implement the Stack class
class Stack {
    Deque<Integer> stack; 
	
	public Stack (int capacity) {
		stack=new ArrayDeque<>(capacity);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
	
	public int top() {
		if(stack.isEmpty()) return -1;
		return stack.peekFirst();
	}
	
	public void push(int element) {
		stack.offerFirst(element);
	}
	
	public void pop() {
		stack.remove();
	}
}
