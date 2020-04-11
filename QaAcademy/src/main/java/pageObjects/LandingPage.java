package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	By signin= By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".text-center>h2");
	By header = By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul");
	
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		
	}




	public WebElement getlogin() {
		return driver.findElement(signin);
	}
	
	public WebElement gettitle () {
		return driver.findElement(title);
	}
	
	public WebElement getheader () {
		return driver.findElement(header);
	}
}
