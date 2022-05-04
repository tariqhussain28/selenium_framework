package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//test next generation
public class testng_testclass02
{
	@Test
    public void m1() throws InterruptedException
    {
    	 System.setProperty("webdriver.chrome.driver", 
 				"E:\\testing\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		
 		driver.get("https://kite.zerodha.com/");
 	
 		Thread.sleep(2000);
 		
 		
 		driver.close();
    }
}
