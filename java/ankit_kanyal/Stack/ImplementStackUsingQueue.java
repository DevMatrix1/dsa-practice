// link- https://workat.tech/problem-solving/practice/implement-stack-using-queues

// using 2 queues

class Stack {
	Queue q1;
	Queue q2;
	int size=0,capacity=0;
	public Stack (int capacity) {
		q1=new Queue();
		q2=new Queue();
		this.capacity=capacity;
	}

	public boolean isEmpty() {
		return size==0;
	}
	
	public int size() {
		return size;
	}
	
	public int top() {
		if(!q1.isEmpty()) return q1.back();
		return q2.back();
	}
	
	public void push(int element) {
		q1.push(element);
		size++;
	}
	
	public void pop() {
		if(q1.size()>=1){
			while(q1.size()!=1){
				q2.push(q1.front());
				q1.pop();
			}
			q1.pop();
		}
		else if(q2.size()>=1){
			while(q2.size()!=1){
				q1.push(q2.front());
				q2.pop();
			}
			q2.pop();
		}
		size--;
		
	}
}

// using single queue

class Stack {
	Queue queue;
	int capacity;
	public Stack (int capacity) {
		this.capacity = capacity;
		queue = new Queue(capacity);
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public int size() {
		return queue.size();
	}
	
	public int top() {
		return queue.front();
	}
	
	public void push(int element) {
		queue.push(element);
		for(int i = 1; i < queue.size(); i++) {
			queue.push(queue.front());
			queue.pop();
		}
	}
	
	public void pop() {
		queue.pop();
	}
}
