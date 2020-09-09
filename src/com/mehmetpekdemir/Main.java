package com.mehmetpekdemir;

import com.mehmetpekdemir.sort.BubbleSort;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class Main {

	public static void main(String[] args) {

		// BubbleSort
		int[] bubbleSortArray = { 20, 35, -15, 7, 55, 1, -22 };
		bubbleSortArray = BubbleSort.sort(bubbleSortArray);
		for (int i = 0; i < bubbleSortArray.length; i++) {
			System.out.print(bubbleSortArray[i] + " ");
		}

		// SelectionSort

	}

}
