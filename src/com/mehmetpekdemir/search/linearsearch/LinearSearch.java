package com.mehmetpekdemir.search.linearsearch;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public class LinearSearch {

	public static int search(int[] input, int value) {

		for (int i = 0; i < input.length; i++) {
			if (input[i] == value) {
				return i;
			}
		}

		return -1;
	}
}
