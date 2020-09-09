package com.mehmetpekdemir;

import com.mehmetpekdemir.sort.BubbleSort;
import com.mehmetpekdemir.sort.SelectionSort;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("---------- Bubble Sort ----------");
		// BubbleSort
		int[] bubbleSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		bubbleSortArray = BubbleSort.sort(bubbleSortArray);
		for (int i = 0; i < bubbleSortArray.length; i++) {
			System.out.print(bubbleSortArray[i] + " ");
		}

		System.out.println("\n---------- Selection Sort ----------");
		// SelectionSort

		int[] selectionSort = { 20, 35, -15, 7, 55, 1, -22 };
		selectionSort = SelectionSort.sort(selectionSort);
		for (int i = 0; i < selectionSort.length; i++) {
			System.out.print(selectionSort[i] + " ");
		}

	}

}
