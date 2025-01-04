package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAccount {

	public static void main(String[] args) {
		// initializing driver
		ChromeDriver driver = new ChromeDriver();

		// loading URL
		driver.get("http://leaftaps.com/opentaps/");

		// pre-condition
		driver.manage().window().maximize();

		// login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// Navigating to create account
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();

		String accountName = "MubasheerG";
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester - Certified by TestLeaf");

		WebElement industryId = driver.findElement(By.name("industryEnumId"));
		Select select1 = new Select(industryId);
		select1.selectByVisibleText("Computer Software");
		WebElement ownerId = driver.findElement(By.name("ownershipEnumId"));
		Select select2 = new Select(ownerId);
		select2.selectByVisibleText("S-Corporation");
		WebElement sourceId = driver.findElement(By.name("dataSourceId"));
		Select select3 = new Select(sourceId);
		select3.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingId = driver.findElement(By.name("marketingCampaignId"));
		Select select4 = new Select(marketingId);
		select4.selectByIndex(6);
		WebElement stateId = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select5 = new Select(stateId);
		select5.selectByValue("TX");

		// submit the account details
		driver.findElement(By.className("smallSubmit")).click();

		// Xpath to get the text of Account name along with id
		String accountNameWithId = driver
				.findElement(By.xpath(
						"//span[text()='Account Name']/parent::td/following-sibling::td/span[@class='tabletext']"))
				.getText();

		// to get the index of '(' after AccountName to split from ID
		int index = accountNameWithId.indexOf('(');

		// to split and get the accountName from Id
		String accountNameSaved = accountNameWithId.substring(0, index).trim();

		// to verify if the Account name created matches with Account name entered
		Assert.assertEquals(accountNameSaved, accountName);

		System.out.println("The account with name " + accountNameSaved + " has been created");

		driver.close();
	}

}
