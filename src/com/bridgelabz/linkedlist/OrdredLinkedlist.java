package com.bridgelabz.linkedlist;

public class OrdredLinkedlist {
	
	    public static void main(String[] args) {
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(40);
	        MyNode<Integer> myFourthNode = new MyNode<>(70);
	        MyOrderedLinkedlist myLinkedlist = new MyOrderedLinkedlist();
	        myLinkedlist.add(myFirstNode);
	        myLinkedlist.add(mySecondNode);
	        myLinkedlist.add(myThirdNode);
	        myLinkedlist.add(myFourthNode);
	        myLinkedlist.printMyNodes();
	        myLinkedlist.isEmpty();
	        myLinkedlist.size();
	    }
}