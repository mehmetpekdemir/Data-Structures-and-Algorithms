package com.mehmetpekdemir.sort.shellsort;

/**
 * 
 * <p>
 * Worst Case Performance = O(n^2) - Quadratic
 * </p>
 * <p>
 * Avarage Case Performance = O(nlogn) - n log star n
 * </p>
 * <p>
 * Best Case Performance = O(nlogn) - n log star n
 * </p>
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class ShellSort {

	public static void sort(int[] array) {

		for (int gap = array.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < array.length; i++) {
				int newElement = array[i];

				int j = i;

				while (j >= gap && array[j - gap] > newElement) {
					array[j] = array[j - gap];
					j -= gap;
				}

				array[j] = newElement;
			}

		}

	}

}
