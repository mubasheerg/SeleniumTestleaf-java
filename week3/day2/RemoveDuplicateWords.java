package week3.day2;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		// Input string
		String text = "We learn Java basics as part of java sessions in java week1";

		// Split the input string into an array of words
		String[] words = text.split(" ");

		// Initialize a count variable to track duplicate words
		int count;

		// Outer loop to traverse each word
		for (int i = 0; i < words.length; i++) {
			count = 1; // Reset count for each word

			// Skip already empty words
			if (words[i].equals("")) {
				continue;
			}

			// Inner loop to compare with other words
			for (int j = i + 1; j < words.length; j++) {
				// Case-insensitive comparison
				if (words[i].equalsIgnoreCase(words[j])) {
					count++; // Increment count if duplicate found
					words[j] = ""; // Replace duplicate word with empty string
				}
			}
		}

		// Reconstruct the sentence without duplicates
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			if (!word.equals("")) { // Skip empty strings
				result.append(word).append(" ");
			}
		}

		// Print the final output
		System.out.println("Modified String: " + result.toString().trim());
	}
}
