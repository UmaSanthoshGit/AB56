package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment83 {
	public static void main(String[] args) throws InterruptedException {
		
		//WAP to write the Relative x-path for the text message <span>Prime</span>
				// driver.findElement(By.xpath("//span[text()=Prime"));

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//WAP to Hoverover Fashion tab of Flipkart application and click on men's t-shirt using x-path
		
		//WAP to launch Flipkart application then Hoverover on Login tab and click on Sign up button and enter Mobile number
		
		driver.get("https://www.flipkart.com/");
		WebElement fashionLink = driver
				.findElement(By.xpath("//img[@alt=\"Fashion\"]"));
		fashionLink.click();
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		Actions action = new Actions(driver);
		action.moveToElement(men).build().perform();
		Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("//div[@class='wZsanD']/a[text()='T-Shirts']"));
		tshirt.click();
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
