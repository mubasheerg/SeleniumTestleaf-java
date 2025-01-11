package week3.day2;

public class FindOccurance {
	public static void main(String[] args) {
		// Input String
		String input = "TestLeaf";

		// Target character to count
		char targetChar = 'e';

		// Initialize count variable
		int count = 0;

		// Convert String to character array
		char[] charArray = input.toCharArray();

		// Loop through the character array
		for (char c : charArray) {
			// Check if the current character matches the target character
			if (c == targetChar) {
				count++;
			}
		}

		System.out.println(
				"The character '" + targetChar + "' occurs " + count + " times in the string \"" + input + "\".");
	}
}
