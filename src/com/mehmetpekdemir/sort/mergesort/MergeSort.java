package com.mehmetpekdemir.sort.mergesort;

/**
 * 
 * <p>
 * Worst Case Performance = O(nlogn) - n log star n
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
public final class MergeSort {

	public static void sort(int[] array, int start, int end) {

		if (end - start < 2) {
			return;
		}

		final int mid = (start + end) / 2;
		sort(array, start, mid);
		sort(array, mid, end);
		merge(array, start, mid, end);

	}

	private static void merge(int[] array, int start, int mid, int end) {

		if (array[mid - 1] <= array[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;

		int[] temp = new int[end - start];

		while (i < mid && j < end) {
			temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
		}

		System.arraycopy(array, i, array, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, array, start, tempIndex);

	}

}
