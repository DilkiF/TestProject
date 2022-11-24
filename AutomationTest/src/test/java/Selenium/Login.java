package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
	}

}
