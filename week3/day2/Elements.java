package week3.day2;

public class Elements {

	public static void main(String[] args) {
		// Create objects and demonstrate inheritance

		// Object of WebElement
		WebElement webElement = new WebElement();
		System.out.println("\nCalling methods from WebElement:");
		webElement.click();
		webElement.setText("Hello World");

		// Object of Button
		Button button = new Button();
		System.out.println("\nCalling methods from Button:");
		button.click();
		button.submit();

		// Object of TextField
		TextField textField = new TextField();
		System.out.println("\nCalling methods from TextField:");
		textField.setText("Sample Input");
		String text = textField.getText();
		System.out.println("Retrieved text: " + text);

		// Object of CheckBoxButton
		CheckBoxButton checkBoxButton = new CheckBoxButton();
		System.out.println("\nCalling methods from CheckBoxButton:");
		checkBoxButton.click();
		checkBoxButton.clickCheckButton();

		// Object of RadioButton
		RadioButton radioButton = new RadioButton();
		System.out.println("\nCalling methods from RadioButton:");
		radioButton.click();
		radioButton.selectRadioButton();
	}
}