package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// initializing driver
		ChromeDriver driver = new ChromeDriver();

		// loading URL
		driver.get("https://en-gb.facebook.com/");

		// pre-coniftion to maximize and wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// finding elements using xpath, name and id
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Leaf");

		// selecting from dropdowns
		WebElement day = driver.findElement(By.id("day"));
		Select select1 = new Select(day);
		select1.selectByVisibleText("21");
		WebElement month = driver.findElement(By.id("month"));
		Select select2 = new Select(month);
		select2.selectByVisibleText("Dec");
		WebElement year = driver.findElement(By.id("year"));
		Select select3 = new Select(year);
		select3.selectByVisibleText("2000");

		// selecting radio button
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();

		driver.findElement(By.name("reg_email__")).sendKeys("9182736450");
		driver.findElement(By.id("password_step_input")).sendKeys("TestLeaf@2025");

		// driver.findElement(By.name("websubmit")).click();

		driver.quit();
	}
}
