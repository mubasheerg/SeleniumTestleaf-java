package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	public static void main(String[] args) {
		// an array declaration
		int[] numbers = { 3, 2, 11, 4, 6, 7 };

		// Adding the array elements to a list
		List<Integer> numberList = new ArrayList<>();
		for (int num : numbers) {
			numberList.add(num);
		}

		// Sorting the list in ascending order
		Collections.sort(numberList);

		// Getting the second largest number
		int secondLargest = numberList.get(numberList.size() - 2);

		// Printing the second largest number
		System.out.println("The second largest number is: " + secondLargest);
	}
}
