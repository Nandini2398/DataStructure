package com.bridgelabz.queues;

public class MyQueue {
private final MyLinkedlist myLinkedlist;
	
	public MyQueue() {
		this.myLinkedlist = new MyLinkedlist();
	}
	public void enqueue(Node newNode) {
		myLinkedlist.append(newNode);
	}
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	public int dequeue() {
		return myLinkedlist.pop();
	}
}