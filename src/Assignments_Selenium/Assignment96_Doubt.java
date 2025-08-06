package Assignments_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment96_Doubt {

	public static void main(String[] args) throws InterruptedException {

//WAP to handle auto suggestion for Pharmeasy -->search Dolo and select 4th option
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://pharmeasy.in/");
		WebElement searchBox = driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-icOztnM-css']"));

		searchBox.click();
		Thread.sleep(2000);
		WebElement searchBox1 = driver.findElement(By.xpath("//div//input[@id='topBarInput']"));
		searchBox1.sendKeys("Dolo");
		List<WebElement> searchList = driver.findElements(By
				.xpath("//div[(@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iioqier-css')]//a[@class='c-iWbDBM c-iWbDBM-idhzjXW-css']"));
		Thread.sleep(3000);

		System.out.println("Size is" + searchList.size());
		// System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
