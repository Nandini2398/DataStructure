package com.bridgelabz.stacks;

public class MystackMain {
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.isEmpty();
		myStack.size();
		Integer valueOfPeekEle = myStack.peek();
		System.out.println("Peek Element "+valueOfPeekEle);
		myStack.pop();
		myStack.pop();
		myStack.printStack();
		
	}
}