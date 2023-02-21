package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pom2 {

		WebDriver driver;
		public Pom2(WebDriver d)
		{
			driver=d;
			PageFactory.initElements(d, this);
		}
	
	    
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")
	WebElement checkbox;
	
	
	
	@Test
	public void check()
	{
		checkbox.click();
	}
	
}
