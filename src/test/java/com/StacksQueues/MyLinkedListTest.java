package com.StacksQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void given_3Numbers_When_Added_To_Linked_List_Should_Be_Added_To_Top() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.add(secondElement);
		test.add(thirdElement);
		test.printMyNode();
		boolean result = test.head.equals(thirdElement) &&
				test.head.getNext().equals(secondElement) &&
				test.tail.equals(firstElement);				
		assertEquals(true, result);
	}

	@Test
	public void given_3Numbers_When_Added_To_Linked_List_Should_Be_Added_To_End() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(thirdElement);
		test.printMyNode();
		boolean result = test.head.equals(firstElement) &&
				test.head.getNext().equals(secondElement) &&
				test.tail.equals(thirdElement);				
		assertEquals(true, result);
	}		
	@Test
	public void given_3Numbers_Insert_Between_Two_Numbers() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(thirdElement);
		test.insert(firstElement, secondElement);
		test.printMyNode();
		boolean result = test.head.equals(firstElement) &&
				test.head.getNext().equals(secondElement) &&
				test.tail.equals(thirdElement);				
		assertEquals(true, result);
	}

	@Test
	public void method_To_Pop_At_First_Node() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(thirdElement);
		assertEquals(firstElement, test.pop());
		test.printMyNode();
	}
	
	@Test
	public void method_To_Pop_At_Last_Node() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(thirdElement);
		assertEquals(thirdElement, test.popLast());
		test.printMyNode();
	}
	
	@Test
	public void method_To_Search_Linked_List_To_Find_Node() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(thirdElement);
		assertEquals(secondElement, test.search(30));
		test.printMyNode();
	}
	

	@Test
	public void method_To_Insert_A_Node_After_Search_Node() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(40);
		MyNode<Integer> fourthElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(fourthElement);
		test.addInBetweenSearch(30, thirdElement);
		test.printMyNode();
		boolean result = test.head.equals(firstElement) &&
				test.head.getNext().equals(secondElement) &&
				test.head.getNext().getNext().equals(thirdElement) &&
				test.tail.equals(fourthElement);				
		assertEquals(true, result);
	}
	
	@Test
	public void method_To_Delete_A_Node_And_Return_Count() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(40);
		MyNode<Integer> fourthElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(fourthElement);
		test.addInBetweenSearch(30, thirdElement);
		test.printMyNode();
		int size = test.delete(40);
		test.printMyNode();
		assertEquals(3,size);
	}
	
	@Test
	public void method_To_Order_Linked_List() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(40);
		MyNode<Integer> fourthElement = new MyNode<>(70);
		MyNode<Integer> fifthElement = new MyNode<>(20);
		MyLinkedList test = new MyLinkedList();
		assertTrue(test.orderedLinkedList(firstElement));
		assertTrue(test.orderedLinkedList(secondElement));
		assertTrue(test.orderedLinkedList(thirdElement));
		assertTrue(test.orderedLinkedList(fifthElement));
		assertTrue(test.orderedLinkedList(fourthElement));
		test.printMyNode();
	}

}
