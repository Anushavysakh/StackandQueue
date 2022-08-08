package com.day14stackandqueue.bridglabz;

public class Queue {
	    //Initialize head(front) and tail(rear) are null
	    static Node front = null;
	    static Node rear = null;

	    
	    public static boolean isEmpty() {
	        return front == null & rear == null;
	    }
	    public static void enqueue(int data) {
	        Node newNode = new Node(data);
	        // If linked-list is empty
	        if (rear == null) {
	            rear = front = newNode;
	            return;
	        }

	        rear.next = newNode;
	        rear = newNode;

	   }

	    public void displayQueue() {
	        Node currentNode = front;
	        while (currentNode != null) {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.next;
	        }
	    }
	    public static int peek() {
	        if (isEmpty()) {
	            System.out.println("Empty queue");
	            return -1;
	        }
	        return front.data;
	    }

	    public static void main(String[] args) {
	        Queue queue = new Queue();
	        System.out.println("Elements added to the queue are :");
	        queue.enqueue(56);
	        queue.enqueue(30);
	        queue.enqueue(70);
	        queue.displayQueue();
	        System.out.println();
	        System.out.println("\nTop Element:"+queue.peek());
	        

	    }
}
