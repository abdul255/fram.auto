package qaAcademy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;
@Test
public class ValidateTitle extends Base{
	
	@BeforeTest
	
	public void initializedriver() throws IOException
	{
		driver =	initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}
	
	public void verifytitle () throws IOException {
	
	
	LandingPage l = new LandingPage (driver);
	Assert.assertEquals(l.gettitle().getText(), "FEATURED COURSES");
	
	}
	
@AfterTest
	
	public void teardown ()
	{
		driver.close();
		driver=null;
	}

}
