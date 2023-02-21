package ui;

import org.testng.annotations.*;

public class BestPractice {

	@BeforeTest
	public void best1()
	{
		System.out.println("i m good so i execute first");
	}
	@BeforeTest
	public void best2()
	{
		System.out.println("i want to execute before method");
	}
	@Test
	public void best3()
	{
		System.out.println("this is sample method");
	}
	@AfterMethod
	public void best4()
	{
		System.out.println("this execute after method");
	}
	@AfterTest
	public void best5()
	{
		System.out.println("this execute after test");
	}
}
