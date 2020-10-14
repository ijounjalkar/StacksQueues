package com.StacksQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	/**
	 * UC3 check test to add elements in stack from top
	 */
	@Test
	public void given_3Numbers_When_Added_To_Queue_Should_Be_Added_from_End() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyQueue test = new MyQueue();
		assertTrue(test.enqueu(firstElement));
		assertTrue(test.enqueu(secondElement));
		assertTrue(test.enqueu(thirdElement));
		test.printQueue();
	}
	/**
	 * UC4 Dequeue
	 */
	@Test
	public void given_Method_Should_Remove_From_Top() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyQueue test = new MyQueue();
		test.enqueu(firstElement);
		test.enqueu(secondElement);
		test.enqueu(thirdElement);
		INode<Integer> dequeue = test.dequeue();
		assertEquals(firstElement, dequeue);
		test.printQueue();
	}
	
}
