package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hichan {
	
@Test
public void good1()
{
System.out.println("3nd");	
}
@BeforeTest
public void good2()
{
System.out.println("1st");	
}

public void good3()
{
System.out.println("2nd");	
}
//@Test
public void good4()
{
System.out.println("middle");
}
@AfterMethod
public void good5()
{
System.out.println("4th");

}
@AfterTest
public void good6()
{
System.out.println("5th");	
}
}

