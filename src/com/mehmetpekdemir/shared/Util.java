package com.mehmetpekdemir.shared;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class Util {

	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		final int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
