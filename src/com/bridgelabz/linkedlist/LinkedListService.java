package com.bridgelabz.linkedlist;

public class LinkedListService {

	public class LinkedListService<T extends Comparable<T>> {
		private Node<T> head;
		private Node<T> tail;
		public void list() {
			head = null;
		}
		public void display() {
			Node<T> temp = head;
			while (temp.next != null) {
				System.out.print(temp.data+"==>");
				temp = temp.next;
			}
			System.out.print(temp.data);
		}
		public void addOrdered(T data) {
			Node<T> n = head;
			Node<T> temp = new Node<T>(data);
			if (head == null) {
				head = temp;
				head.next = tail;
				tail = head;
			} else if (data.compareTo((T) head.data) < 0) {
				temp.next = head;
				head = temp;
			} else {
				if (data.compareTo((T) tail.data) > 0) {
					tail.next = temp;
					tail = temp;
					return;
				}
				Node<T> prev = null;
				while (data.compareTo((T) n.data) > 0 && n.next != null) {
					prev = n;
					n = n.next;
				}
				prev.next = temp;
				temp.next = n;
			}
		}
}
