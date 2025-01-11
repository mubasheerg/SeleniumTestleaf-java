package week3.day1;

public class ReverseString {
	public static void main(String[] args) {
		// Input string
		String companyName = "TestLeaf";

		// Step 1: Convert the string to a character array
		char[] charArray = companyName.toCharArray();

		// Step 2: Print characters in reverse order
		System.out.print("Reversed String: ");
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
