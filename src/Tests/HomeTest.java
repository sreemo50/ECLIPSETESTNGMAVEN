package Tests;

import org.testng.annotations.Test;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;


import Common.AbstractTest;
import Page.HomePage;


public class HomeTest extends AbstractTest {


	public HomeTest()
	{
		
	}
	
	@Test(priority=0)
	public void Login() {
		plaza.HomeScreen().emailentry("sree2sree02@gmail.com");		
		plaza.HomeScreen().passcodeentry("****");
		plaza.HomeScreen().clickOnLogin();
	  }
	
	@Test(priority=1,dependsOnMethods="Login")
	public void ValueCheking() {
		plaza.EntryScreen().namecheck("Sreekanth");
	  }
	
	@Test(priority=2)
	public void Marketplace() {
		plaza.EntryScreen().NameClick();		
	  }
	
	
	
	
	
	}

