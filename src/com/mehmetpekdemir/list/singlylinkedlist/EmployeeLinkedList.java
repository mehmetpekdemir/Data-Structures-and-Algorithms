package com.mehmetpekdemir.list.singlylinkedlist;

import com.mehmetpekdemir.shared.Employee;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class EmployeeLinkedList {

	private EmployeeNode head = null;
	private int size = 0;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		EmployeeNode node = head;
		head = head.getNext();
		size--;
		node.setNext(null);
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
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
