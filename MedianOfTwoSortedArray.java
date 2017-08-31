package com.mine.DS_ALGO;

public class MedianOfTwoSortedArray {

	private static int findMedian(int[] first, int[] second) {
		int median = Integer.MIN_VALUE;

		if (first[0] > second[second.length - 1]) {
			return (first[0] + second[second.length - 1]) / 2;

		} else if (first[first.length - 1] < second[0]) {
			return (first[first.length - 1] + second[0]) / 2;

		} else
			median = findMedianRecursivly(first, second, first.length);

		return median;
	}

	private static int findMedianRecursivly(int[] first, int[] second, int len) {

		if (len == 2) {
			return (Math.max(first[0], second[0]) + Math.min(first[1], second[1])) / 2;
		}

		int m1 = getMedian(first);
		int m2 = getMedian(second);

		if (m1 == m2)
			return m1;

		if (m2 > m1) {
			if (len % 2 == 0)
				return findMedianRecursivly(splitArray(first, len / 2, first.length), splitArray(second, 0, len / 2),
						len / 2);
			else

				return findMedianRecursivly(splitArray(first, len / 2, first.length),
						splitArray(second, 0, (len / 2) + 1), (len / 2) + 1);
		} else {

			if (len % 2 == 0)
				return findMedianRecursivly(splitArray(first, 0, len / 2), splitArray(second, len / 2, second.length),
						len / 2);
			else

				return findMedianRecursivly(splitArray(first, 0, (len / 2) + 1),
						splitArray(second, len / 2, second.length), (len / 2) + 1);
		}

	}

	private static int[] splitArray(int[] array, int first, int last) {
		int[] returnedArray = new int[last - first];
		for (int i = first, j = 0; i < last; i++, j++) {
			returnedArray[j] = array[i];
		}
		return returnedArray;
	}

	private static int getMedian(int[] arr) {
		if (arr.length % 2 == 0) {
			return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
		} else {
			return arr[arr.length / 2];
		}
	}

	public static void main(String[] args) {

		// int[] firstArray = { 1, 2, 3, 4 };
		// int[] secondArray = { 5, 6, 8, 10 };

		// int[] secondArray = { 1, 12, 15, 26, 38 };
		// int[] firstArray = { 2, 13, 17, 30, 45 };

		// int[] firstArray = { 1, 12, 15, 26, 38 };
		// int[] secondArray = { 2, 13, 17, 30, 45 };

		// int[] firstArray = { 1, 4, 5 };
		// int[] secondArray = { 2, 3, 7 };

		// int[] firstArray = { 5, 6, 8, 10 };
		// int[] secondArray = { 1, 2, 3, 4 };

		int firstArray[] = { 1, 2, 3, 4, 5 };
		int secondArray[] = { 22, 23, 27, 30, 45 };

		// int firstArray[] = { 1, 2, 3, 6 };
		// int secondArray[] = { 4, 5, 8, 10 };

		// System.out.println(getMedian(secondArray));

		System.out.println(findMedian(firstArray, secondArray));
	}

}
