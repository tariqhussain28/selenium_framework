package day2_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login2Page {

@FindBy(xpath = "//input[@id='pin']")	private WebElement pin;
@FindBy(xpath = "//button[text()='Continue ']")	private WebElement cntbtn;

public kite_login2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public void enterpin()
{
   pin.sendKeys("240621");	
}
	
public void presscntbtn()
{
	cntbtn.click();
}
	
}
