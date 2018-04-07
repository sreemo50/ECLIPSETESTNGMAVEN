package Common;

import PLAZA.PlazaC;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public abstract class AbstractTest {
	protected WebDriver seleniumWebDriver;
	protected PLAZASITE plaza;
	
  @Parameters("browser")
  @BeforeClass
  public void ConnectToDeviceOrBrowser(String browser) throws MalformedURLException {
  //public void ConnectToDeviceOrBrowser() throws MalformedURLException {
	  
	  if(browser.equals("IE")){
		  System.setProperty("webdriver.InternetExplorer.driver","F:\\supportsoftware\\geckodriver.exe");
		  this.seleniumWebDriver=SeleniumWebDriverBuilder.foIEDriverWebDriverWebDriverrDriver().withLink(new URL(PlazaC.siteURL)).withPlatform("").withVersion("").build();		  
		  
	  }
	  else if(browser.equals("Chrome")){
	
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
		  //System.setProperty("webdriver.chrome.driver","F:\\supportsoftware\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver","F:\\supportsoftware\\chromedriver.exe");
		  this.seleniumWebDriver=SeleniumWebDriverBuilder.foChromeDriverWebDriverWebDriverrDriver().withLink(new URL(PlazaC.siteURL)).withPlatform("").withVersion("").withOption(options).build();
		  
	  }
	  else if(browser.equals("FireFox")){
		  
		  System.setProperty("webdriver.gecko.driver","F:\\supportsoftware\\geckodriver.exe");
		  this.seleniumWebDriver=SeleniumWebDriverBuilder.foFirefoxDriverWebDriverrDriver().withLink(new URL(PlazaC.siteURL)).withPlatform("").withVersion("").build();
		  
	  }
	  else
	  {
		  System.out.println("The browser doesnot support");
	  }
	  seleniumWebDriver.get(PlazaC.siteURL);
	  seleniumWebDriver.manage().window().maximize();
	  plaza=new PLAZASITE(seleniumWebDriver);
  }

  //@BeforeSuite
  //public void beforeSuite() {
	  
  //}
  
 /*@AfterSuite
  public void beforeSuite() {
	  seleniumWebDriver.quit();
  }
*/ 
 
  

}
