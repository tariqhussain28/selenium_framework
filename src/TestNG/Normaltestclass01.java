package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normaltestclass01
{
   public static void main(String[] args) throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", 
				"E:\\testing\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
	
		Thread.sleep(2000);
		
		
		driver.close();
}
}
