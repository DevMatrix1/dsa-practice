// link- https://workat.tech/problem-solving/practice/implement-queue-array

// Implement the Queue class
class Queue {
	Deque<Integer> queue;
	Queue (int capacity) {
		queue=new ArrayDeque<>();
	}

	boolean isEmpty() {
		return queue.isEmpty();
	}
	
	int size() {
		return queue.size();
	}
	
	int front() {
		if(queue.size()==0) return -1;
		return queue.peekFirst();
	}
	
	int back() {
		if(queue.size()==0) return -1;
		return queue.peekLast();
	}
	
	void push(int element) {
		queue.add(element);
	}
	
	void pop() {
		queue.remove();
	}
}
