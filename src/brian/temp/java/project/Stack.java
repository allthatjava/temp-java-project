package brian.temp.java.project;

public class Stack {

	Object[] array;
	int capacity;
	int cursor;
	
	// Constructor sets the capacity
	public Stack(int capacity) {
		array = new Object[capacity];
		this.capacity = capacity;
		cursor = -1;
	}
	
	// Push
	public void push(Object obj) {
		if(isFull())
			throw new RuntimeException("Stack is full");
		
		array[++cursor] = obj;
	}
	
	// Pop
	public Object pop() {
		if(isEmpty())
			throw new RuntimeException("Stack is empty");
		
		return array[cursor--];
	}
	
	// Peek
	public Object peek() {
		return array[cursor];
	}
	
	// isFull
	private boolean isFull() {
		return cursor+1 >= capacity;
	}
	
	// isEmpty
	private boolean isEmpty() {
		return cursor == -1;
	}
	
}
