/**
 * 
 */
package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

/**
 * @author sreekanth
 *
 */
public  class AbstractPage {
	
	public WebDriver driver;
	
	public AbstractPage(WebDriver driver)
	{
		this.driver=driver;
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		PageFactory.initElements(driver,this);
	}
	
	//for web alert
	public void AlertDetails()
	{
		Alert alert=driver.switchTo().alert();
		System.out.print(alert.getText());
		alert.accept();
		
	}	

	//for web alert
	public void WindowsAlertDetails()
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();		
	}
	
	public void MouseOverAndClick(WebElement mouseoverElement)
	{
		Actions mouseover=new Actions(driver);
		Action mo=mouseover.moveToElement(mouseoverElement).build();
	}	
	

}
