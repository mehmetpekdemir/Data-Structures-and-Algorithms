package com.mehmetpekdemir.sort.countingsort;

/**
 * 
 * <p>
 * Worst Case Performance = O(n+k)
 * </p>
 * <p>
 * Avarage Case Performance = O(n+k)
 * </p>
 * <p>
 * Best Case Performance = O(n+k)
 * </p>
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class CountingSort {

	public static void sort(int[] array, int min, int max) {

		int[] countArray = new int[(max - min) + 1];

		for (int i = 0; i < array.length; i++) {
			countArray[array[i] - min]++;
		}

		int j = 0;
		for (int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				array[j++] = i;
				countArray[i - min]--;
			}
		}
	}

}
