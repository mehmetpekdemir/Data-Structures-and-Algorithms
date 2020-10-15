package com.mehmetpekdemir.list.doublylinkedlist;

import com.mehmetpekdemir.shared.Employee;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class EmployeeDoublyLinkedList {

	private EmployeeNode head = null;
	private EmployeeNode tail = null;
	private int size = 0;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}

		head = node;
		size++;
	}

	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}

		tail = node;
		size++;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		EmployeeNode node = head;
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		head = head.getNext();
		size--;
		node.setNext(null);

		return node;
	}

	public EmployeeNode removeFromEnd() {
		if (isEmpty()) {
			return null;
		}

		EmployeeNode node = tail;
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}

		tail = tail.getPrevious();
		size--;
		node.setPrevious(null);

		return node;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		return size;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
