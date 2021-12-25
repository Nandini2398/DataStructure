package com.bridgelabz.linkedlist;

	public class Node<T> {
		public T data;
		public Node<T> next;
		public Node(T data){
			super();
			this.data=data;
			this.next=null;
		}
		public T getdata() {
			return data;
		}
		public void setdata(T data) {
			this.data = data;
		}
		public Node getNext() {
	        return next;
	    }
	    public void setNext(Node next) {
	        this.next = next;
	    }
}
	
