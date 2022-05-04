package day3_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepagepage
{

	@FindBy(xpath = "//span[@class='user-id']") private WebElement userid1;
	
	
	public kitehomepagepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifykitehomepageuserid()
	{
		String actualresult=userid1.getText();
		String expectedresult="TR3583";
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("pass");
			
		}
		
		else
		{
			System.out.println("fail");
		}
	}
	
	
	
	
}
