package week3.day2;

public class StringManipulation {

	public static void main(String[] args) {
		// Input string
		String test = "changeme";

		// Convert the string to a character array
		char[] charArray = test.toCharArray();

		// Loop through the character array from end to start
		for (int i = 0; i < charArray.length; i++) {
			// Check if the index is odd
			if (i % 2 != 0) {
				// Change the character at the odd index to uppercase
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}

		// Convert the modified character array back to a String and print the result
		String result = new String(charArray);
		System.out.println("Modified String: " + result);
	}
}
