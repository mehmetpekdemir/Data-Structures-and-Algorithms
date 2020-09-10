package com.mehmetpekdemir;

import com.mehmetpekdemir.sort.BubbleSort;
import com.mehmetpekdemir.sort.InsertionSort;
import com.mehmetpekdemir.sort.MergeSort;
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

	}

}
