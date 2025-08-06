package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment76 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to automate the amazon login page

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.navigate().refresh();
		WebElement helloSignIn =  driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]")); 
		Actions action = new Actions(driver);
		action.moveToElement(helloSignIn).build().perform();
		WebElement signInBtn = driver.findElement(By.xpath("//span[text()='Sign in']"));
		signInBtn.click();
		Thread.sleep(3000);
		WebElement emailID = driver.findElement(By.xpath("//input[@name='email']"));
		emailID.sendKeys("test@gmail.com");
		WebElement continueBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		continueBtn.click();
		Thread.sleep(1000);
		WebElement pswd = driver.findElement(By.id("ap_password"));
		WebElement signIn = driver.findElement(By.id("signInSubmit"));
		pswd.sendKeys("password");
		signIn.click();	
	}

}
