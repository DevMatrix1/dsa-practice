// link- https://workat.tech/problem-solving/practice/implement-queue-using-stacks

class Queue {
	Stack front;
	Stack back;
	int size,capacity;
	Queue (int capacity) {
		front=new Stack(capacity);
		back=new Stack(capacity);
		size=0;
		this.capacity=capacity;
	}

	boolean isEmpty() {
		return size==0;
	}
	
	int size() {
		return size;
	}
	
	int front() {
		if(!back.isEmpty()){
			return back.top();
		}
		else if(!front.isEmpty()){
			while(!front.isEmpty()){
				back.push(front.top());
				front.pop();
			}
			return back.top();
		}
		return -1;
	}
	
	int back() {
		if(!front.isEmpty()){
			return front.top();
		}
		else{
			while(!back.isEmpty()){
				front.push(back.top());
				back.pop();
			}
			return front.top();
		}
	}
	
	void push(int element) {
		front.push(element);
		size++;
	}
	
	void pop() {
		if(!back.isEmpty()){
			back.pop();
		}
		else{
			while(!front.isEmpty()){
				back.push(front.top());
				front.pop();
			}
			back.pop();
		}
		size--;
	}
}
