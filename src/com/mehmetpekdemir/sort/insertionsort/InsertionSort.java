package com.mehmetpekdemir.sort.insertionsort;

/**
 * 
 * <p>
 * Worst Case Performance = O(n^2) - Quadratic
 * </p>
 * <p>
 * Avarage Case Performance = O(n^2) - Quadratic
 * </p>
 * <p>
 * Best Case Performance = O(n) - Linear
 * </p>
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class InsertionSort {

	public static void sort(int[] array) {

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
			int newElement = array[firstUnsortedIndex];

			int i;

			for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
				array[i] = array[i - 1];
			}

			array[i] = newElement;
		}

	}
}
