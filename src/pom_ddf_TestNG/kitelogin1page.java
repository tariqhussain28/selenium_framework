package pom_ddf_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1page 
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement un;
	@FindBy(xpath = "//input[@id='password']") private WebElement pass;
	@FindBy(xpath = "//button[contains(text(),'Login ')]") private  WebElement loginbutton;
	
	public kitelogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpkitelogin1username(String name)
	{
		un.sendKeys(name);
		
	}
	
	public void inpkitelogin1password(String password)
	{
		pass.sendKeys(password);
	}
	
	public void clickkitelogin1lgnbtn()
	{
		loginbutton.click();
	}
	
	
	
	

}
