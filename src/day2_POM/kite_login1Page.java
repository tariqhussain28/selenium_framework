package day2_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login1Page {
	//step1 declaration of variable
	
@FindBy(xpath = "//input[@id='userid']")  private WebElement un;
@FindBy(xpath = "//input[@id='password']")  private WebElement pass;
@FindBy(xpath = "//button[contains(text(),'Login ')]")  private WebElement loginbtn;

   //step2  initialisation of variable

public kite_login1Page(WebDriver driver)
{
 PageFactory.initElements(driver, this);
}

   //step3 using variable

public void enterun()
{
	un.sendKeys("TR3583");
}

public void enterpass()
{
	pass.sendKeys("Bhavi@2406");
}

public void pressloginbtn()
{
	loginbtn.click();
}

}
