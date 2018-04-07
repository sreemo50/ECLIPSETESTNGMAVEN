package Common;

import org.openqa.selenium.WebDriver;

import Page.EntryPage;
import Page.HomePage;

public class PLAZASITE {
	
	private final WebDriver driver;
	
	public PLAZASITE(WebDriver driver)
	{
		this.driver=driver;
		//driver.wait(, nanos);
		
	}

	public HomePage HomeScreen()
	{
		return new HomePage(driver);
		
	}
	
	public EntryPage EntryScreen()
	{
		return new EntryPage(driver);
		
	}
	
	
}
