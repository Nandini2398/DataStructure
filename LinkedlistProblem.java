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
	        public void insertUsingKey(Node myNode,Node value){
	            Node tempNode = this.head;
	            while(tempNode != null ) {
	                if (myNode.getKey() == tempNode.getKey()) {
	                    Node temp =tempNode.getNext();
	                    tempNode.setNext(value);
	                    tempNode = tempNode.getNext();
	                    tempNode.setNext(temp);
	                    break;
	                }
	                tempNode=tempNode.getNext();
	            }
	        }
	     public  void printMyNodes(){
		        StringBuffer myNodes = new StringBuffer("My Nodes:");
		        Node tempNode = head;
		        while(tempNode.getNext()!= null){
		            myNodes.append(tempNode.getKey());
		            if(!tempNode.equals(tail))
		                myNodes.append("->");
		                tempNode=tempNode.getNext();
		        }
	        myNodes.append(tempNode.getKey());
	        System.out.println(myNodes);
	    }
	}