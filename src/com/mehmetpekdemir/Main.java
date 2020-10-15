package com.mehmetpekdemir;

import com.mehmetpekdemir.list.Employee;
import com.mehmetpekdemir.list.doublylinkedlist.EmployeeDoublyLinkedList;
import com.mehmetpekdemir.list.singlylinkedlist.EmployeeLinkedList;
import com.mehmetpekdemir.sort.BubbleSort;
import com.mehmetpekdemir.sort.CountingSort;
import com.mehmetpekdemir.sort.InsertionSort;
import com.mehmetpekdemir.sort.MergeSort;
import com.mehmetpekdemir.sort.QuickSort;
import com.mehmetpekdemir.sort.RadixSort;
import com.mehmetpekdemir.sort.SelectionSort;
import com.mehmetpekdemir.sort.ShellSort;

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
	}

}
