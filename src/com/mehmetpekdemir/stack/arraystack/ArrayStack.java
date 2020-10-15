package com.mehmetpekdemir.stack.arraystack;

import java.util.EmptyStackException;

import com.mehmetpekdemir.shared.Employee;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class ArrayStack {

	private Employee[] stack;
	private int top = 0;

	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}

	public void push(Employee employee) {
		if (top == stack.length) {
			Employee[] newEmployees = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, newEmployees, 0, stack.length);
			stack = newEmployees;
		}

		stack[top++] = employee;
	}

	public Employee pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		Employee employee = stack[--top];
		stack[top] = null;

		return employee;
	}

	public Employee peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return stack[top - 1];
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public int size() {
		return top;
	}

	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}
