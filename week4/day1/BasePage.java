package week4.day1;

public class BasePage {

	// Method to find an element
	public void findElement(String locator) {
		System.out.println("Finding element using locator: " + locator);
		// Add logic to locate the element
	}

	// Method to click an element
	public void clickElement(String locator) {
		System.out.println("Clicking on element with locator: " + locator);
		// Add logic to click the element
	}

	// Method to enter text into an element
	public void enterText(String locator, String text) {
		System.out.println("Entering text '" + text + "' into element with locator: " + locator);
		// Add logic to enter text
	}

	// Method to perform common tasks
	public void performCommonTasks() {
		System.out.println("Performing common tasks from BasePage.");
		// Add common logic here
	}
}
