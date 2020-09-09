package com.mehmetpekdemir;

import com.mehmetpekdemir.sort.BubbleSort;
import com.mehmetpekdemir.sort.InsertionSort;
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
		bubbleSortArray = BubbleSort.sort(bubbleSortArray);
		for (int i = 0; i < bubbleSortArray.length; i++) {
			System.out.print(bubbleSortArray[i] + " ");
		}

		System.out.println("\n---------- Selection Sort ----------");

		int[] selectionSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		selectionSortArray = SelectionSort.sort(selectionSortArray);
		for (int i = 0; i < selectionSortArray.length; i++) {
			System.out.print(selectionSortArray[i] + " ");
		}
		
		System.out.println("\n---------- Insertion Sort ----------");

		int[] insertionSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		insertionSortArray = InsertionSort.sort(insertionSortArray);
		for (int i = 0; i < insertionSortArray.length; i++) {
			System.out.print(insertionSortArray[i] + " ");
		}
		
		System.out.println("\n---------- Shell Sort ----------");

		int[] shellSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		shellSortArray = ShellSort.sort(shellSortArray);
		for (int i = 0; i < shellSortArray.length; i++) {
			System.out.print(shellSortArray[i] + " ");
		}

	}

}
