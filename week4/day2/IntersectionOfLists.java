package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfLists {
	public static void main(String[] args) {
		// Declare two arrays
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };

		// Add array elements to two lists
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int num : array1) {
			list1.add(num);
		}
		for (int num : array2) {
			list2.add(num);
		}

		// Find the intersection of the two lists
		System.out.println("Intersection of the two lists:");
		for (int num : list1) {
			if (list2.contains(num)) { // Check if list2 contains the current element of list1
				// Printing the intersecting element
				System.out.println(num);
			}
		}
	}
}
