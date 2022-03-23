package com.stack;

public class Stack {
	Node head;

	class Node<T> {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			next = null;
		}

	}

	/**
	 * @param data is value to be pushed this method pushes an element to the top of
	 *             the stack
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;

		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	/**
	 * @return the top of the stack
	 */
	public int peek() {
		if (head == null) {
			System.out.println("Stack is empty, Underflow");
			return 0;
		}
		return (int) head.data;

	}

	/**
	 * this method displays content of the stack
	 */
	public void display() {
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Stack contains");
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "---> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	/**
	 * this method pops or removes the element from the top of the stack
	 */
	public void pop() {
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		}
		head = head.next;
	}

}
