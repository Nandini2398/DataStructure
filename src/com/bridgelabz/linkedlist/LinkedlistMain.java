package com.bridgelabz.linkedlist;

public class LinkedlistMain {

		public static void main(String[] args) {
			MyLinkedlist<Integer> mylinkedlist = new MyLinkedlist<Integer>();
			
			System.out.println("Using add method: ");
			mylinkedlist.add(70);
			mylinkedlist.add(30);
			mylinkedlist.add(56);
			mylinkedlist.display();
			System.out.println("\nUsing append method");
			mylinkedlist.append(56);
			mylinkedlist.append(30);
			mylinkedlist.append(70);
			mylinkedlist.display();	
			mylinkedlist.clearList();
			System.out.println("\nAdd number in between");
			mylinkedlist.append(56);
			mylinkedlist.append(70);
			mylinkedlist.insertAt(1, 30);
			mylinkedlist.display();
			System.out.println("\nDelete First element");
			mylinkedlist.popFirst();
			mylinkedlist.display();
			mylinkedlist.clearList();
			System.out.println("\nDelete Last element");
			mylinkedlist.append(56);
			mylinkedlist.append(30);
			mylinkedlist.append(70);
			mylinkedlist.popLast();
			mylinkedlist.display();
			System.out.println("\nFinding the element from the list");
			if(mylinkedlist.search(30))
			{
				System.out.println("Element Found");
			}
			else
			{
				System.out.println("Element not found");
			}
			
			mylinkedlist.clearList();
			System.out.println("Add element after 30");
			mylinkedlist.append(56);
			mylinkedlist.append(30);
			mylinkedlist.append(70);
			mylinkedlist.insertAt(mylinkedlist.index(30)+1, 40);
			mylinkedlist.display();
			System.out.println("\nDeleting 40 from the list and showing size.");
			if(mylinkedlist.search(40))
			{
				mylinkedlist.pop(mylinkedlist.index(40));
				System.out.println("Now the size of list is "+mylinkedlist.size());
				mylinkedlist.display();
			}
			else {
				System.out.println("Element is not present in list");
			}
		}
}