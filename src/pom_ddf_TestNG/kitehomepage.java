package pom_ddf_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepage
{
 
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userid;
	
	public kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String gethomepageuserid()
	{
		String actuserid=userid.getText();
		return actuserid;
	}
	
	
	
	
}
