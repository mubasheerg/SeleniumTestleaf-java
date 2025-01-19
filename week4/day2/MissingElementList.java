package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {
	public static void main(String[] args) {
		// an array declaration
		int[] numbers = { 1, 2, 3, 4, 10, 6, 8 };

		// Adding the array elements to a list
		List<Integer> numberList = new ArrayList<>();
		for (int num : numbers) {
			numberList.add(num);
		}

		// Sorting the list in ascending order
		Collections.sort(numberList);

		// Checking for missing elements in the sequence
		System.out.print("Missing elements: ");
		for (int i = 0; i < numberList.size() - 1; i++) {
			int current = numberList.get(i);
			int next = numberList.get(i + 1);
			while (current + 1 < next) {
				current++;
				// Printing missing number
				System.out.print(+current + " ");
			}
		}
	}
}
