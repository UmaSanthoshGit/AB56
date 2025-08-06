package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment75_ {

	public static void main(String[] args) {
		// WAP to automate the facebook login page
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement emailid = driver.findElement(By.id("email"));
		WebElement pswd = driver.findElement(By.id("pass"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name = 'login']"));
		
		
		emailid.sendKeys("testing@gmail.com");
		pswd.sendKeys("pswd");
		loginBtn.click();
		driver.close();
		
		
		
		

	}

}
