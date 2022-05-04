package day2_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_homePage
{
    @FindBy(xpath = "//span[@class='user-id']") private WebElement userid;
    
    public kite_homePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void actualuserid()
    {
    	String result = userid.getText();
    	String expected="TR3583";
    	
    	if(result.equals(expected))
    	{
    		System.out.println("pass");
    	}
    	
    	else
    	{
    		System.out.println("fail");
    	}
    }
    
	
	
	
}
