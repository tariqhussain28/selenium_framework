package day4_POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Kitelogin2page
{

	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement continuebtn;
	
	public Kitelogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpkitelogin2pagepin(String pinvalue)
	{
		pin.sendKeys(pinvalue);
	}
	
	public void clickkitelogin2pagecontinuebtn()
	{
		continuebtn.click();
	}
	
	
}
