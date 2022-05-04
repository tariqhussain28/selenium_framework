package day3_POM;
//with proper naming conventions
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1page 
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login ')]") private WebElement loginbtn;
	
	
	public kitelogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpkitelogin1pageusername()
	{
		username.sendKeys("TR3583");
	}
	
	public void inpkitelogin1pagepassword() 
	{
		password.sendKeys("Bhavi@2406");
	}
	
	public void clickkitelogin1pageloginbtn()
	{
		loginbtn.click();
	}

}
