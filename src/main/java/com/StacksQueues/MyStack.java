package com.StacksQueues;

public class MyStack {
	public final MyLinkedList myLinkedList;
	
	/**
	 * Constructor
	 */
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public boolean push(INode myNode) {
		myLinkedList.add(myNode);
		return true;
	}

	public void printMyStack() {
		myLinkedList.printMyNode();
	}
	/**-
	 * Peek UC2
	 * @return
	 */
	public INode peak() {
		return myLinkedList.head;
		
	}
	public INode pop() {
		return myLinkedList.pop();
	}
	public void printMyStack1() {
		myLinkedList.printMyNode();
	}

}
