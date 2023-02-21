package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pom1 {
     WebDriver driver;
	

	@BeforeTest
	public void pm1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driverCHROME\\chromedriver.exe");
		 driver =new ChromeDriver();
		
		
		driver.get("https://demoqa.com/radio-button");
	}
	
	@AfterTest
	public void pm2()
	{
		
		driver.quit();
	}
	
    @Test
	public void goandclick()
	{
    	Pom2 p = new Pom2(driver);
		p.check();
	}
}
