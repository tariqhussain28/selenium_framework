package pom_ddf_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2page 
{

	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement continuebtn;
	
	public kitelogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpkitelogin2pagepin(String pin1)
	{
		pin.sendKeys(pin1);
	}
	
	public void clickkitelogin2pagecontinuebtn()
	{
		continuebtn.click();
	}
	
	
	
	
	
}
