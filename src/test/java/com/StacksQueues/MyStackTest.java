package com.StacksQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {
	@Test
	public void given3NumbersWhenAddedToStackShouldBeAddedToTop() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyStack test = new MyStack();
		assertTrue(test.push(firstElement));
		assertTrue(test.push(secondElement));
		assertTrue(test.push(thirdElement));
		test.printMyStack();
		
	}
	/**
	 * UC2 Return top element when peek
	 */
	@Test
	public void given3NumbersWhenPeekShoulReturnTopNode() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyStack test = new MyStack();
		test.push(firstElement);
		test.push(secondElement);
		test.push(thirdElement);
		test.printMyStack();
		INode<Integer> peak = test.peak();
		assertEquals(thirdElement,peak);

	}
	
	/**
	 * Pop Stack
	 */
	@Test
	public void given3NumbersWhenPopShoulReturnLastNode() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyStack test = new MyStack();
		test.push(firstElement);
		test.push(secondElement);
		test.push(thirdElement);
		test.printMyStack();
		INode<Integer> pop = test.pop();
		assertEquals(thirdElement,pop);
		test.printMyStack();
	}



}
