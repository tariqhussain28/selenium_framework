package day4_POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Kitelogin1page {

 
	@FindBy(xpath = "//input[@id='userid']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login ')]") private WebElement loginbtn;
	
	public Kitelogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpkitelogin1pageusername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void inpkitelogin1pagepassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickkitelogin1pageloginbtn()
	{
		loginbtn.click();
	}
	

}
