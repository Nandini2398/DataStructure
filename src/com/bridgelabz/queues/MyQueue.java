package com.bridgelabz.queues;

public class MyQueue {

		private final MyLinkedList myLinkedList;
		
		public MyQueue() {
			this.myLinkedList = new MyLinkedList();
		}
		public void enqueue(INode newNode) {
			myLinkedList.append(newNode);
		}
		public void printQueue() {
			myLinkedList.printMyNodes();
		}
		public int dequeue() {
			return myLinkedList.pop();
			
		}
		public int size() {
			return myLinkedList.size();
		}
		public void isEmpty() {
			myLinkedList.isEmpty();
		}
		public Integer peek() {
			return myLinkedList.peek();
		}
}
