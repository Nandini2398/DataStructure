package com.bridgelabz.linkedlist;

	public class LinkedListProblem {
		public static void main(String[] args) {
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	        //MyNode<Integer> myFourthNode = new MyNode<>(40);
	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.insert(myFirstNode,mySecondNode);
	        myLinkedList.search(mySecondNode);
	        myLinkedList.printMyNodes();

	    }

	}