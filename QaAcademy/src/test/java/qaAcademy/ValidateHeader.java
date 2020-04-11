package qaAcademy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateHeader extends Base{

	@BeforeTest
	public void initialize() throws IOException
	{
		driver =	initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	
	public void verifyheader () throws IOException {
	
	
	
	LandingPage l = new LandingPage (driver);
	Assert.assertTrue(l.getheader().isDisplayed());

	}
	
	@AfterTest
	
	public void teardown ()
	{
		driver.close();
		driver=null;
	}
	
}

