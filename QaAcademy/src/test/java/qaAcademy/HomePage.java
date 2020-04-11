package qaAcademy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =	initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test(dataProvider="getdata")
	public void basePageNavigation (String email, String password, String text) throws IOException {
		
		
		
		LandingPage l = new LandingPage (driver);
		l.getlogin().click();
	

	LoginPage log = new LoginPage(driver);
	log.getemail().sendKeys(email);
	log.getpassword().sendKeys(password);
	System.out.println(text);
	log.getlogin().click();
	}
	
	
	
	@DataProvider 
	public Object[][]getdata () {
	
		Object[][] data = new Object[2] [3];
		
		data[0][0]= "nonrestricted34@yahoo.com";
		data[0][1]= "13456";
		data[0][2]= "non-restricted";
		
		data[1][0]= "restricted34@yahoo.com";
		data[1][1]= "13456";
		data[1][2]= "restricted";
		return data;
	}
	
	
@AfterTest
	
	public void teardown ()
	{
		driver.close();
		driver=null;
	}
	
	
	
	
	
	
	
	
}

	