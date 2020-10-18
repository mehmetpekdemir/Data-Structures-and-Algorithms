package com.mehmetpekdemir.queue.arrayqueue;

import java.util.NoSuchElementException;

import com.mehmetpekdemir.shared.Employee;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
		front = 0;
		back = 0;
	}

	public void add(Employee employee) {
		if (back == queue.length) {
			Employee[] newEmployees = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newEmployees, 0, queue.length);
			queue = newEmployees;
		}

		queue[back++] = employee;
	}

	public Employee remove() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		Employee employee = queue[front];
		queue[front] = null;
		front++;
		if (isEmpty()) {
			front = 0;
			back = 0;
		}

		return employee;
	}

	public Employee peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		return queue[front];
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return back - front;
	}

	public void printQueue() {
		for (int i = front; i < back; i++) {
			System.out.println(queue[i]);
		}
	}
}
