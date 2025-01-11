package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadFunctionality {
	public static void main(String[] args) {
    	ChromeDriver driver = new ChromeDriver();

		// loading URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize window
		driver.manage().window().maximize();

		// login using username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();


		// Navigate through CRM/SFA -> Leads
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		// Fill in the Create Lead form using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Demo Company");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Johnny");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Engineering");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Lead Description");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("john.doe@example.com");

		// Select State/Province dropdown using visible text
		WebElement stateDropdown = driver
				.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select stateSelect = new Select(stateDropdown);
		stateSelect.selectByVisibleText("New York");

		// Click on Create Lead button
		driver.findElement(By.className("smallSubmit")).click();

		// Click on Edit button
		driver.findElement(By.linkText("Edit")).click();

		// Clear the Description field and fill Important Note
		WebElement descriptionField = driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']"));
		descriptionField.clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']"))
				.sendKeys("This is an important note.");

		// Click on the Update button
		driver.findElement(By.className("smallSubmit")).click();

		// Capture the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title after Update: " + pageTitle);

		// Close the browser
		driver.quit();

	}
}
