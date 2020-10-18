package com.mehmetpekdemir.sort.bubblesort;

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
 * Best Case Performance = O(n) - Linear
 * </p>
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class BubbleSort {

	public static void sort(int[] array) {

		boolean flag = true;

		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (array[i] > array[i + 1]) {
					flag = false;
					Util.swap(array, i, i + 1);
				}
			}
			if (flag == true) {
				System.out.println("Already sorted.");
				break;
			}
		}

	}

}
