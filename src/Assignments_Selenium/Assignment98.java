package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment98 {
	public static void main(String[] args) throws InterruptedException {

		// WAP for Pharmeasy application, Hoverover lab tests then select All tests and
		// click on 1st book option-->select 5 patient option
		// --click view cart and proceed , enter the phone number and click continue

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pharmeasy.in/");
		Thread.sleep(2000);
		WebElement labTest = driver.findElement(By.xpath(
				"(//nav[@class='c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iiScJxF-css']/ul/li/a[text()='Lab Tests'])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(labTest).build().perform();
		WebElement allTest = driver.findElement(By.xpath("//div[@id='dropdown']//a[text()='All Tests']"));
		allTest.click();

		WebElement bookBtn = driver.findElement(By.xpath("(//button[@id='book-test-btn-pdp'])[1]"));
		bookBtn.click();

		Thread.sleep(1000);
		WebElement patientSelect = driver.findElement(By.xpath("//div[@id='patient-5']"));
		patientSelect.click();
		Thread.sleep(1000);
		WebElement viewCart = driver.findElement(By.xpath("//div[text()='View Cart']"));
		viewCart.click();
		Thread.sleep(1000);
		WebElement proceed = driver.findElement(By.id("cart-addPatient-Dweb"));
		proceed.click();
		Thread.sleep(1000);
		WebElement mobilenumber = driver.findElement(By.id("mobile"));
		mobilenumber.sendKeys("125656");
		WebElement continueBtn = driver.findElement(By.xpath("//div[@class='sc-5d829af0-5 fKywnM']"));
		continueBtn.click();
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
