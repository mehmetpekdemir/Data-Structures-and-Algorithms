package com.mehmetpekdemir.sort.radixsort;

/**
 * 
 * <p>
 * Worst Case Performance = O(kn)
 * </p>
 * <p>
 * Avarage Case Performance = O(kn)
 * </p>
 * <p>
 * Best Case Performance = O(kn)
 * </p>
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class RadixSort {

	public static void sort(int[] array, int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(array, i, radix);
		}
	}

	private static void radixSingleSort(int[] array, int position, int radix) {

		final int length = array.length;
		int[] countArray = new int[radix];

		for (int value : array) {
			countArray[getDigit(position, value, radix)]++;
		}

		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j - 1];
		}

		int[] temp = new int[length];
		for (int i = length - 1; i >= 0; i--) {
			temp[--countArray[getDigit(position, array[i], radix)]] = array[i];
		}

		for (int i = 0; i < length; i++) {
			array[i] = temp[i];
		}

	}

	private static int getDigit(int position, int value, int radix) {
		return value / (int) Math.pow(radix, position) % radix;
	}

}
