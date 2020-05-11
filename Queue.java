package hw;

public class Queue {
	// An int[] data field named elements that stores the int values in the queue.
	private int[] elements = new int[8];
	private int number;
	//A data field named size that stores the number of elements in the queue.
	private int size;
	// A constructor that creates a Queue object with default capacity 8.
	public Queue(int number) {
		this.number = number;
		elements = new int[number];
	}
	// The method enqueue(int v) that adds v into the queue.
	public int[] enqueue(int v) {
		if(size == elements.length) {
			elements = new int[size * 2];

		}

		elements[size] = v;
		size++;
		return elements;

	}


	// The method dequeue() that removes and returns the element from the queue.
	public int dequeue() {
		int first = elements[0];

		for(int i = 0; i < size -1; i++) {
			elements[i] = elements[i+1];
		}
		size--;


		return first;

	}

	// The method empty() that returns true if the queue is empty.
	public  boolean empty() {
		while(elements.length > 0) {
			return false;
		}
		return true;
	}

	// The method getSize() that returns the size of the queue.
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
		Queue queue = new Queue(20);
		for(int i = 0; i<20; i++) {
			queue.enqueue(i);
		}
		for (int i = 0; i < 20; i++) {
			System.out.println(queue.dequeue());

		}


	}
}


