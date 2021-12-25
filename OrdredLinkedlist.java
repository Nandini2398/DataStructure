package com.bridgelabz.linkedlist;

public class OrdredLinkedlist {
	
	public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyOrderedLinkedList myLinkedList = new MyOrderedLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFourthNode);
        myLinkedList.printMyNodes();
        myLinkedList.isEmpty();
        myLinkedList.size();
    }
}