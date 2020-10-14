package com.StacksQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {
	@Test
	void given3NumbersWhenAddedToStackShouldBeAddedToTop() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyStack test = new MyStack();
		assertTrue(test.push(firstElement));
		assertTrue(test.push(secondElement));
		assertTrue(test.push(thirdElement));
		test.printMyStack();
		
	}

}
