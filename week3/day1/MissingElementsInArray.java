package week3.day1;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// Input array
		int[] arr = { 1, 4, 3, 2, 8, 6, 7 };

		// Sort the array
		Arrays.sort(arr);

		// Loop through the array to find the missing element
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				// Print the missing number
				System.out.println("Missing element: " + (arr[i] + 1));
				break;
			}
		}
	}
}
