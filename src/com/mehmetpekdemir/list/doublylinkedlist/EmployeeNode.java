package com.mehmetpekdemir.list.doublylinkedlist;

import com.mehmetpekdemir.shared.Employee;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;
	private EmployeeNode previous;

	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	public EmployeeNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return employee.toString();
	}
	
}
