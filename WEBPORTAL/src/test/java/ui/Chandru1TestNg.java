package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chandru1TestNg {
    private static final String groups = null;
	private static final String[] functional = null;
	@BeforeClass
	public void chan1()
	{
		System.out.println("before test execute");
	}
    @Test(groups="functional")
    public void chan2()
    {
    	System.out.println("just chan2");
    }
    @Test(groups="functional")
    public void chan3()
    {
    	System.out.println("just chan3");
    }
}
