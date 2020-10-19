package com.mehmetpekdemir;

import java.util.PriorityQueue;

import com.mehmetpekdemir.list.doublylinkedlist.EmployeeDoublyLinkedList;
import com.mehmetpekdemir.list.singlylinkedlist.EmployeeLinkedList;
import com.mehmetpekdemir.queue.arrayqueue.ArrayQueue;
import com.mehmetpekdemir.search.binarysearch.BinarySearch;
import com.mehmetpekdemir.search.linearsearch.LinearSearch;
import com.mehmetpekdemir.shared.Employee;
import com.mehmetpekdemir.sort.bubblesort.BubbleSort;
import com.mehmetpekdemir.sort.countingsort.CountingSort;
import com.mehmetpekdemir.sort.insertionsort.InsertionSort;
import com.mehmetpekdemir.sort.mergesort.MergeSort;
import com.mehmetpekdemir.sort.quicksort.QuickSort;
import com.mehmetpekdemir.sort.radixsort.RadixSort;
import com.mehmetpekdemir.sort.selectionsort.SelectionSort;
import com.mehmetpekdemir.sort.shellsort.ShellSort;
import com.mehmetpekdemir.stack.arraystack.ArrayStack;
import com.mehmetpekdemir.stack.linkedstack.LinkedStack;
import com.mehmetpekdemir.tree.Tree;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("---------- Bubble Sort ----------");

		int[] bubbleSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		BubbleSort.sort(bubbleSortArray);
		for (int i = 0; i < bubbleSortArray.length; i++) {
			System.out.print(bubbleSortArray[i] + " ");
		}

		System.out.println("\n---------- Selection Sort ----------");

		int[] selectionSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		SelectionSort.sort(selectionSortArray);
		for (int i = 0; i < selectionSortArray.length; i++) {
			System.out.print(selectionSortArray[i] + " ");
		}

		System.out.println("\n---------- Insertion Sort ----------");

		int[] insertionSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		InsertionSort.sort(insertionSortArray);
		for (int i = 0; i < insertionSortArray.length; i++) {
			System.out.print(insertionSortArray[i] + " ");
		}

		System.out.println("\n---------- Shell Sort ----------");

		int[] shellSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		ShellSort.sort(shellSortArray);
		for (int i = 0; i < shellSortArray.length; i++) {
			System.out.print(shellSortArray[i] + " ");
		}

		System.out.println("\n---------- Merge Sort ----------");

		int[] mergeSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		MergeSort.sort(mergeSortArray, 0, mergeSortArray.length);
		for (int i = 0; i < mergeSortArray.length; i++) {
			System.out.print(mergeSortArray[i] + " ");
		}

		System.out.println("\n---------- Quick Sort ----------");

		int[] quickSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		QuickSort.sort(quickSortArray, 0, quickSortArray.length);
		for (int i = 0; i < quickSortArray.length; i++) {
			System.out.print(quickSortArray[i] + " ");
		}

		System.out.println("\n---------- Counting Sort ----------");

		int[] countingSortArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
		CountingSort.sort(countingSortArray, 1, 10);
		for (int i = 0; i < countingSortArray.length; i++) {
			System.out.print(countingSortArray[i] + " ");
		}

		System.out.println("\n---------- Radix Sort ----------");

		int[] radixSortArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
		RadixSort.sort(radixSortArray, 10, 4);
		for (int i = 0; i < radixSortArray.length; i++) {
			System.out.print(radixSortArray[i] + " ");
		}

		System.out.println("\n---------- Singly Linked List ----------");

		EmployeeLinkedList singlyLinkedList = new EmployeeLinkedList();
		System.out.println(singlyLinkedList.isEmpty());

		singlyLinkedList.addToFront(new Employee(1L, "Mehmet", "Pekdemir"));
		singlyLinkedList.addToFront(new Employee(2L, "Mehmet2", "Pekdemir2"));
		singlyLinkedList.addToFront(new Employee(3L, "Mehmet3", "Pekdemir3"));
		System.out.println(singlyLinkedList.removeFromFront());
		System.out.println(singlyLinkedList.getSize());

		singlyLinkedList.printList();

		System.out.println("\n---------- Doubly Linked List ----------");

		EmployeeDoublyLinkedList doublyLinkedList = new EmployeeDoublyLinkedList();
		System.out.println(doublyLinkedList.isEmpty());

		doublyLinkedList.addToFront(new Employee(1L, "Mehmet", "Pekdemir"));
		doublyLinkedList.addToFront(new Employee(2L, "Mehmet2", "Pekdemir2"));
		doublyLinkedList.addToFront(new Employee(3L, "Mehmet3", "Pekdemir3"));
		System.out.println(doublyLinkedList.removeFromFront());
		System.out.println(doublyLinkedList.getSize());

		doublyLinkedList.addToEnd(new Employee(3L, "Mehmet3", "Pekdemir3"));
		doublyLinkedList.printList();

		System.out.println(doublyLinkedList.removeFromEnd());

		System.out.println("\n---------- Array Stack ----------");

		ArrayStack arrayStack = new ArrayStack(3);
		arrayStack.push(new Employee(1L, "Mehmet", "Pekdemir"));
		arrayStack.push(new Employee(2L, "Mehmet2", "Pekdemir2"));
		arrayStack.push(new Employee(3L, "Mehmet3", "Pekdemir3"));

		arrayStack.printStack();

		System.out.println(arrayStack.pop());

		System.out.println(arrayStack.size());

		System.out.println(arrayStack.peek());

		System.out.println("\n---------- Linked Stack ----------");

		LinkedStack linkedStack = new LinkedStack();
		linkedStack.push(new Employee(1L, "Mehmet", "Pekdemir"));
		linkedStack.push(new Employee(2L, "Mehmet2", "Pekdemir2"));
		linkedStack.push(new Employee(3L, "Mehmet3", "Pekdemir3"));

		linkedStack.printStack();

		System.out.println(linkedStack.pop());

		System.out.println(linkedStack.size());

		System.out.println(linkedStack.peek());

		System.out.println("\n---------- Linear Search ----------");

		final int[] linearSearchArray = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println(LinearSearch.search(linearSearchArray, -15));

		System.out.println("\n---------- Binary Search ----------");

		final int[] binarySearchArray = { -22, -15, 1, 7, 20, 35, 55 };
		System.out.println(BinarySearch.search(binarySearchArray, -15));

		System.out.println("\n---------- Array Queue ----------");

		ArrayQueue arrayQueue = new ArrayQueue(3);

		arrayQueue.add(new Employee(1L, "Mehmet", "Pekdemir"));
		arrayQueue.add(new Employee(2L, "Mehmet2", "Pekdemir2"));
		arrayQueue.add(new Employee(3L, "Mehmet3", "Pekdemir3"));

		arrayQueue.printQueue();

		System.out.println(arrayQueue.isEmpty());

		System.out.println(arrayQueue.remove());

		System.out.println(arrayQueue.size());

		System.out.println(arrayQueue.peek());

		System.out.println("\n---------- Priority Queue ----------");

		PriorityQueue<Employee> priorityQueue = new PriorityQueue<Employee>();

		priorityQueue.add(new Employee(1L, "Mehmet", "Pekdemir")); // add
		priorityQueue.add(new Employee(2L, "Mehmet2", "Pekdemir2"));
		priorityQueue.add(new Employee(3L, "Mehmet3", "Pekdemir3"));

		System.out.println(priorityQueue.peek()); // printing the top element

		System.out.println(priorityQueue.poll()); // removing the top element

		System.out.println(priorityQueue.peek());

		System.out.println("\n---------- Tree ----------");

		Tree tree = new Tree();
		tree.insert(25);
		tree.insert(20);
		tree.insert(15);
		tree.insert(27);
		tree.insert(30);
		tree.insert(29);
		tree.insert(26);
		tree.insert(22);
		tree.insert(32);

		System.out.println("\n----------Pre Order----------");
		tree.traversePreOrder();

		System.out.println("\n----------In Order----------");
		tree.traverseInOrder();

		System.out.println("\n----------Post Order----------");
		tree.traversePostOrder();

		System.out.println("\n" + tree.get(27));
		System.out.println(tree.min());
		System.out.println(tree.max());

	}

}
