package TestNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser {
@Parameters("browsername")
@Test
public void tc1(String browsername) throws InterruptedException
{  WebDriver driver = null;
	
	if (browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\automation testing\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
 
	else if (browsername.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver", "E:\\testing\\automation testing\\SELENIUM\\edge driver\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	
    driver.get("https://kite.zerodha.com/");
    
    Thread.sleep(3000);
    
    driver.quit();
    
    
}

}
