package Assignments_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment86 {
	public static void main(String[] args) throws InterruptedException {

		// WAP for Dropdown using - byIndex, byVisibletext and byValue method - for Select a Skill, Select a Country and Select a Religion
		// URL - https://grotechminds.com/registration/

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://grotechminds.com/registration/");
		WebElement skill = driver.findElement(By.id("Skills"));
		Select select = new Select(skill);
		select.selectByVisibleText("Technical Skills");

		WebElement country = driver.findElement(By.id("Country"));
		Select id = new Select(country);
		id.selectByValue("Germany");

		WebElement religion = driver.findElement(By.id("Relegion"));
		Select religion1 = new Select(religion);
		religion1.selectByIndex(1);

		Thread.sleep(5000);
		driver.close();

	}

}
