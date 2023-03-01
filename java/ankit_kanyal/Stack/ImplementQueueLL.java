// link- https://workat.tech/problem-solving/practice/implement-queue-linked-list

class Queue{
	ListNode front;
	ListNode rear;
	int size = 0;
	int total = 0;
	
	Queue (int capacity) {
		front = rear = null;
		size = 0;
		total = capacity;

	}

	boolean isEmpty() {
		return rear == null;
	}
	
	int size() {
		return size;
	}
	
	int front() {
		if(front == null) {
			return -1;
		}
		return front.data;
	}
	
	int back() {
		if(rear == null) {
			return -1;
		}
		return rear.data;

	}
	
	void push(int element) {
		ListNode temp = new ListNode(element);
		if (rear == null) {
            front = rear = temp;
			size++;
            return;
        }
		rear.next = temp;
        rear = temp;
		size++;

	}
	
	void pop() {
		if (this.front == null) {
            return;
		}
        ListNode temp = this.front;
        front = front.next;
        if (front == null) {
            rear = null;
		}
		size--;
	}
}
