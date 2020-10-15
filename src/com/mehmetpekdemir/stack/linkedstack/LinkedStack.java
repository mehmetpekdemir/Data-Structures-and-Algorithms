package com.mehmetpekdemir.stack.linkedstack;

import java.util.LinkedList;
import java.util.ListIterator;

import com.mehmetpekdemir.shared.Employee;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class LinkedStack {

	private LinkedList<Employee> stack;

	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}

	public void push(Employee employee) {
		stack.push(employee);
	}

	public Employee pop() {
		return stack.pop();
	}

	public Employee peek() {
		return stack.peek();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public int size() {
		return stack.size();
	}

	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
