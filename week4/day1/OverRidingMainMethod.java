package week4.day1;

public class OverRidingMainMethod {
	public static void main(String[] args) {
		// Create an object of BasePage
		BasePage basePage = new BasePage();
		basePage.performCommonTasks(); // Calls BasePage implementation

		// Create an object of LoginPage
		LoginPage loginPage = new LoginPage();
		loginPage.performCommonTasks(); // Calls overridden LoginPage implementation

		// Call other methods from the superclass
		loginPage.findElement("username_field");
		loginPage.enterText("username_field", "admin");
		loginPage.clickElement("login_button");
	}
}
