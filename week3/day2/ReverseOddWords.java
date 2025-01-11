package week3.day2;

public class ReverseOddWords {
	public static void main(String[] args) {
		// Input string
		String test = "I am a software tester";

		// Split the input string into words
		String[] words = test.split(" ");

		// StringBuilder to store the final output
		StringBuilder result = new StringBuilder();

		// Traverse through the words
		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) { // Odd index (1-based odd position)
				// Reverse the word
				char[] charArray = words[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					result.append(charArray[j]);
				}
			} else {
				// Append the word as it is for even positions
				result.append(words[i]);
			}
			// Add a space after each word
			result.append(" ");
		}

		System.out.println("Output: " + result.toString().trim());
	}
}
