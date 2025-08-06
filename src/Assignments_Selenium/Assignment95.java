package Assignments_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment95 {
	public static void main(String[] args) throws InterruptedException {

		// WAP to handle auto suggestions on Youtube-->search Modi-->select 3rd option

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");

		WebElement searchbox = driver.findElement(By.name("search_query"));
		searchbox.sendKeys("Modi");
		Thread.sleep(2000);
		List<WebElement> searchList = driver.findElements(By.xpath("//div[@role=\"listbox\"]/div"));
		System.out.println(searchList.size());
		searchList.get(2).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
