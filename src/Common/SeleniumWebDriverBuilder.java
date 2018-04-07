package Common;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class SeleniumWebDriverBuilder<SELF,DRIVER extends WebDriver> {
	
	protected URL urllink;
	protected String platform;
	protected String version;
	protected ChromeOptions withopt;
	
	public static FirefoxDriverWebDriver foFirefoxDriverWebDriverrDriver(){
		return new FirefoxDriverWebDriver();
		
	}
	
	public static ChromeDriverWebDriver foChromeDriverWebDriverWebDriverrDriver(){
		return new ChromeDriverWebDriver();
		
	}
	public static IEDriverWebDriver foIEDriverWebDriverWebDriverrDriver(){
		return new IEDriverWebDriver();
		
	}
	
	public static class FirefoxDriverWebDriver extends SeleniumWebDriverBuilder<FirefoxDriverWebDriver,FirefoxDriver>{
		
		public FirefoxDriver build()
		{
		return new FirefoxDriver();
		}
		
	}
	

	public static class ChromeDriverWebDriver extends SeleniumWebDriverBuilder<ChromeDriverWebDriver,ChromeDriver>{
		
		public ChromeDriver build()
		{
			
		return new ChromeDriver(withopt);
		}
		
	}
	

	public static class IEDriverWebDriver extends SeleniumWebDriverBuilder<IEDriverWebDriver,InternetExplorerDriver>{
		
		public InternetExplorerDriver build()
		{
		return new InternetExplorerDriver();
		}
		
	}
	public SELF withLink(URL urld)
	{
		this.urllink=urld;
		return (SELF) this;
		
	}
	public SELF withPlatform(String platform)
	{
		this.platform=platform;
		return (SELF) this;
		
	}
	public SELF withVersion(String version)
	{
		this.version=version;
		return (SELF) this;
		
	}
	public SELF withOption(ChromeOptions withOptionset)
	{
		this.withopt=withOptionset;
		return (SELF) this;
		
	}
	
	
	
	public abstract DRIVER build();
	

}
