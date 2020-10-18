package com.mehmetpekdemir.sort.quicksort;

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
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class QuickSort {

	public static void sort(int[] array, int start, int end) {

		if (end - start < 2) {
			return;
		}

		final int pivotIndex = partition(array, start, end);
		sort(array, start, pivotIndex);
		sort(array, pivotIndex + 1, end);
	}

	private static int partition(int[] array, int start, int end) {

		final int pivot = array[start];
		int i = start;
		int j = end;

		while (i < j) {

			while (i < j && array[--j] >= pivot);
			if (i < j) {
				array[i] = array[j];
			}

			while (i < j && array[++i] <= pivot);
			if (i < j) {
				array[j] = array[i];
			}

		}

		array[j] = pivot;
		return j;
	}

}
