package week3.day2;

class LoginTestData extends TestData {

	// Method to simulate entering a username
	public void enterUsername() {
		System.out.println("Username entered.");
	}

	// Method to simulate entering a password
	public void enterPassword() {
		System.out.println("Password entered.");
	}

	public static void main(String[] args) {
		// Create an object of the superclass TestData
		TestData testData = new TestData();
		System.out.println("Calling methods from the superclass:");
		testData.enterCredentials();
		testData.navigateToHomePage();

		// Create an object of the subclass LoginTestData
		LoginTestData loginTestData = new LoginTestData();
		System.out.println("Calling methods from the subclass:");
		loginTestData.enterUsername();
		loginTestData.enterPassword();

		System.out.println("Calling inherited methods from the superclass in the subclass:");
		loginTestData.enterCredentials();
		loginTestData.navigateToHomePage();
	}

}
