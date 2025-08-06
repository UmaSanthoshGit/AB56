package Assignments_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment97 {
	public static void main(String[] args) throws InterruptedException {

		// WAPt to handle auto suggestion in apollo application. eg search "Bruf" in
		// searchbar and select first product

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
		driver.navigate().refresh();
		WebElement searchbox = driver.findElement(By.xpath("//div[@class='Home_searchSelectMain__VL1lN']"));
		searchbox.click();
		Thread.sleep(3000);
		driver.findElement(By.id("searchProduct")).sendKeys("bruf");
		Thread.sleep(2000);
		List<WebElement> searchList = driver
				.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7']/ul/li"));
		int size = searchList.size();
		System.out.println(size);
		searchList.get(0).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
