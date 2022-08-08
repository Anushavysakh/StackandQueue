package com.day14stackandqueue.bridglabz;


public class LinkedList<T> {
	
		public class Node <T>{

			int data; 
			Node link; 
		}

		Node top;
		
		LinkedList()
		{
			this.top = null;
		}

		public void push(int x) 
		{
			
			Node temp = new Node();

			if (temp == null) {
				System.out.print("\nHeap Overflow");
				return;
			}

			temp.data = x;
			temp.link = top;
			top = temp;
		}

		public boolean isEmpty()
		{
			return top == null;
		}

		// Utility function to return top element in a stack
		

		public void display()
		{
			// check for stack underflow
			if (top == null) {
				System.out.printf("\nStack Underflow");
			}
			else {
				Node temp = top;
				while (temp != null) {

					// print node data
					System.out.printf("%d->", temp.data);

					temp = temp.link;
				}
			}
		}
}

