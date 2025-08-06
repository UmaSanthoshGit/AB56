package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment92 {
	public static void main(String[] args) throws InterruptedException {

		// WAP for right click.right click on mobile for flipcart
		// "https://www.flipkart.com/"
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		WebElement mobiles = driver.findElement(By.xpath("//img[@alt = 'Mobiles & Tablets']"));
		Actions action = new Actions(driver);
		action.contextClick(mobiles).build().perform();

		System.out.println(driver.getTitle());
		driver.close();

	}

}
