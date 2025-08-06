package Assignments_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment74 {

	public static void main(String[] args) {
		// Write a Selenium program to launch multiple browsers - Chrome , Edge, Firefox etc
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2 = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver3 = new EdgeDriver();
		
		

	}

}
