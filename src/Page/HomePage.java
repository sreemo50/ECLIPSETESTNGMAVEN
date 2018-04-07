package Page;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common.AbstractPage;
import Common.PLAZASITE;



public class HomePage extends AbstractPage {
	
	public HomePage(WebDriver driver)
	{		
		super(driver);	
		
		
	}
	
	//public static By Gotit1	=By.xpath("//*[@id='navigation-box']/div[2]/div/div/div[2]/div[4]/div[2]/span[2]");
/*	@FindBy(how=How.XPATH,using="//*[@id='navigation-box']/div[2]/div/div/div[2]/div[4]/div[2]/span[2]")
	private WebElement Gotit;
	
	@FindBy(how=How.XPATH,using="//*[@id='navigation-box']/div[2]/div/div/div[2]/div[4]/div[2]/span[1]")
	private WebElement next;
	
	@FindBy(how=How.XPATH,using="//*[@id='custom-search-input']/div/input")
	private WebElement Search;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[6]/div/div/div[2]/span/button[1]")
	private WebElement Register;
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[6]/div/div/div[2]/span/button[2]")
	private WebElement Login;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[3]/searchto-carconfigurator/div/div")
	private WebElement BuildYourCar;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[6]/div/div/div[1]/div[1]")
	private WebElement MENU;
	
	@FindBy(how=How.XPATH,using="//*[@id='large']/div[1]/div[2]/div")
	private WebElement NvigationAssistent;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='chatApp']/div/div[3]/div[2]/img")
	private WebElement trending;
	
	@FindBy(how=How.XPATH,using="//*[@id='social_share']/div[1]")
	private WebElement share;
	
	@FindBy(how=How.XPATH,using="//*[@id='custom-search-input']/div/span/button")
	private WebElement searchBtn;*/
	

	@FindBy(how=How.NAME,using="email")
	private WebElement emails;

	@FindBy(how=How.ID,using="u_0_2")
	private WebElement LoginBtn;

	@FindBy(how=How.ID,using="pass")
	private WebElement passcodes;	

	public void emailentry(String email)
	{
		try{
		emails.sendKeys(email);
		
		//emails.sendKeys(email);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	public void passcodeentry(String passcd)
	{
		passcodes.sendKeys(passcd);
	}

	
	
	public void clickOnLogin()
	{
		LoginBtn.click();
	}


	/*
	public void clickGotIT()
	{
		Gotit.click();
	}*/
	/*
	public void clickNext()
	{
		next.click();
	}

	public void clickSearch()
	{
		Search.click();
		
	}
	
	public void TypeSearch(String model)
	{		
		Search.sendKeys(model);
	}
	
	public void clicksearchBtn()
	{
		//WebDriverWait ws=new WebDriverWait(driver, 600);
		searchBtn.click();
	}

	public void clickRegister() {
		// TODO Auto-generated method stub
		Register.click();
		
		
	}
*/	
	
	
	


}
