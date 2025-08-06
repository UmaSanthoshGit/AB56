package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment78 {

	public static void main(String[] args) throws InterruptedException {
		// WAP using locators linkText, PartialLinkText, TagName, ClassName
		// WAP to type Gold Price Today on Google search text field using Absolute
		// X-path 'https://www.google.com'

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("About")).click();
		int totalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("TotalLinks" + totalLinks);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Advertis")).click();
		driver.navigate().back();
		WebElement textbox = driver.findElement(By.className("gLFyf"));
		textbox.sendKeys("Gold Price today");
		
		
		

	}

}
