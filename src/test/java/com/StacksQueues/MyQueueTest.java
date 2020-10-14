package com.StacksQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	/**
	 * UC3 check test to add elements in stack from top
	 */
	@Test
	public void given3NumbersWhenAddedToQueueShouldBeAddedfromEnd() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyQueue test = new MyQueue();
		assertTrue(test.enqueu(firstElement));
		assertTrue(test.enqueu(secondElement));
		assertTrue(test.enqueu(thirdElement));
		test.printQueue();
	}
}
