package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {
	public static void main(String[] args) {
		// the input string
		String companyName = "google";

		// create a Set to store unique characters
		Set<Character> uniqueChars = new LinkedHashSet<>();

		// iterate through each character in the string
		for (char c : companyName.toCharArray()) {
			uniqueChars.add(c);
		}

		// print the unique characters
		System.out.print("Unique characters: ");
		for (char c : uniqueChars) {
			System.out.print(c);
		}
	}
}
