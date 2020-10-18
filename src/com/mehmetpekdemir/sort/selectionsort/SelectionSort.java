package com.mehmetpekdemir.sort.selectionsort;

import com.mehmetpekdemir.shared.Util;

/**
 * 
 * <p>
 * Worst Case Performance = O(n^2) - Quadratic
 * </p>
 * <p>
 * Avarage Case Performance = O(n^2) - Quadratic
 * </p>
 * <p>
 * Best Case Performance = O(n^2) - Quadratic
 * </p>
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class SelectionSort {

	public static void sort(int[] array) {

		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

			int largest = 0;

			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (array[i] > array[largest]) {
					largest = i;
				}
			}
			Util.swap(array, largest, lastUnsortedIndex);
		}

	}

}
