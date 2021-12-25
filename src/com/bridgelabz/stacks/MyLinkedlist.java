package com.bridgelabz.stacks;

	public class MyLinkedlist {
	    public   INode head;
	    public   INode tail;

	    public MyLinkedList(){
	            this.head = null;
	            this.tail = null;
	        }
	    public void add(INode newNode) {
	        if(this.tail == null){
	            this.tail=newNode;
	        }
	        if(this.head== null){
	            this.head=newNode;

	        }else{
	            INode tempNode = this.head;
	            this.head = newNode;
	            this.head.setNext(tempNode);
	         }
	        }
	     public void append(INode newNode){
	        if(this.head == null){
	            this.head=newNode;
	        }
	        if(this.tail== null){
	            this.tail=newNode;
	        }else{
	            this.tail.setNext(newNode);
	            this.tail=newNode;
	        }
	        }
	     public int pop() {
	    	 if(this.head == null) {
	    		 return 0;
	    	 }
	    	 Integer currentValue = (Integer) head.getKey();
	    	 this.head = this.head.getNext();
	    	 return currentValue;
	     }
	     public Integer peek() {
	    	 return (Integer)head.getKey();
	     }
	     public void insert(INode myNode ,INode newNode){
	        INode tempNode = myNode.getNext();
	        myNode.setNext(newNode);
	        newNode.setNext(tempNode);
	        }
	     public void isEmpty() {
	    	 if(head == null) {
	    		 System.out.println("Empty");
	    	 }
	    	 else {
	    		 System.out.println("Not Empty");
	    	 }
	     }
	     public INode popLast() {
	         if (head == null) {
	             System.out.println("Empty");
	         } else if (head.getNext() == null) {
	             head = null;
	         } else {
	             INode currentNode = head;
	             INode preNode = head;
	             while (currentNode.getNext() != null) {
	                 preNode = currentNode;
	                 currentNode = currentNode.getNext();
	             }
	             preNode.setNext(null);
	         }
			return tail;
	     }

	     public  int size(){
	    	 int counter = 1;
	         INode tempNode = this.head;
	         while(tempNode != this.tail) {
	             if (tempNode.getNext() == null) {

	             } else {
	                 tempNode = tempNode.getNext();
	                 counter++;
	             }
	         }
	        System.out.println("Size of current Linked List is: "+counter);
	        return counter;
	     }
	     public void search(INode myNode) {
	            INode tempNode = this.head;
	            while(tempNode != null ) {
	                if (myNode.getKey() == tempNode.getKey()) {
	                    System.out.println("Element found :"+myNode.getKey());
	                    break;
	                }
	                tempNode=tempNode.getNext();
	            }
	        }
	      public void insertUsingKey(INode myNode,INode value){
	            INode tempNode = this.head;
	            while(tempNode != null ) {
	                if (myNode.getKey() == tempNode.getKey()) {
	                    INode temp =tempNode.getNext();
	                    tempNode.setNext(value);
	                    tempNode = tempNode.getNext();
	                    tempNode.setNext(temp);
	                    break;
	                }
	                tempNode=tempNode.getNext();
	            }
	        }
	      public void deleteKey(INode myNode ){
	            INode tempNode = this.head;
	            while(tempNode != null ) {
	                if (myNode.getKey() == tempNode.getKey()) {
	                    INode temp =tempNode.getNext();
	                    //tempNode= null;
	                    INode demoNode = this.head;
	                    demoNode = demoNode.getNext();
	                    demoNode.setNext(temp);
	                    break;
	                }
	                tempNode=tempNode.getNext();
	            }
	        }
	    public  void printMyNodes(){
	        StringBuffer myNodes = new StringBuffer("My Nodes:");
	        INode tempNode = head;
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

