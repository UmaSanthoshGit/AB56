package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment85 {
	public static void main(String[] args) throws InterruptedException {

		// WAP to launch Flipkart application then Hoverover on Login tab and click on
		// Sign up button and enter Mobile number

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/account/login?ret=/");

		WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions action = new Actions(driver);
		action.moveToElement(Login).perform();
		WebElement signInBtn = driver.findElement(By.xpath("//div[@type='Sign Up']"));
		signInBtn.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("98787");
		driver.close();

	}

}
