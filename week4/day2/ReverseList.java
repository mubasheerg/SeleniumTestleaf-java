package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {
		// Step 1: Declare a String array and add values
		String[] companies = { "Innoppl", "TestLeaf", "QEagle", "Zoho" };

		// Step 2: Add the array elements to a list
		List<String> companyList = new ArrayList<>();
		Collections.addAll(companyList, companies);

		// Step 3: Arrange the collection in ascending order
		Collections.sort(companyList);

		// Step 4: Print the list in reverse order
		System.out.println("Reversed list:");
		for (int i = companyList.size() - 1; i >= 0; i--) {
			System.out.println(companyList.get(i));
		}
	}
}
