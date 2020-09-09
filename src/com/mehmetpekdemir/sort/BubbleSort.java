package com.mehmetpekdemir.sort;

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
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class BubbleSort {

	public static int[] sort(int[] array) {

		boolean flag = true;
		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (array[i] > array[i + 1]) {
					flag = false;
					swap(array, i, i + 1);
				}
			}
			if (flag == true) {
				System.out.println("Already sorted.");
				break;
			}
		}

		return array;
	}

	private static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		final int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
