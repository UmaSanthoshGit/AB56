package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment88_91 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement json = driver.findElement(By.id("container-10"));
		WebElement drop = driver.findElement(By.id("div2"));
		WebElement selenium = driver.findElement(By.id("container-5"));
		WebElement gitHub = driver.findElement(By.id("container-4"));

		Actions action = new Actions(driver);
		action.dragAndDrop(json, drop).build().perform();
		Thread.sleep(3000);
		action.dragAndDrop(drop, json).build().perform();
		Thread.sleep(3000);

		action.dragAndDrop(selenium, drop).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(drop, selenium).build().perform();
		Thread.sleep(3000);

		action.dragAndDrop(gitHub, drop).build().perform();
		driver.close();

	}

}
