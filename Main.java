package com.day14stackandqueue.bridglabz;

public class Main2 {
	public static void main(String[] args)
	{
		// create Object of Implementing class
		LinkedList2<Integer> obj = new LinkedList2<>();
		
		System.out.println("Inserting values to stack:");
		obj.push(70);

		obj.push(30);

		obj.push(56);

		obj.display();
     
		System.out.print("\nTop element is :"+obj.peek());
		System.out.println("\nPopping 56:");
		obj.pop();
		obj.display();
		System.out.print("\nTop element is :"+obj.peek());
		System.out.println("\nPopping 30:");
		obj.pop();
		obj.display();
		System.out.print("\nTop element is :"+obj.peek());
		System.out.println("\nPopping 70:");
		obj.pop();
		obj.display();

		

		
	}
}
