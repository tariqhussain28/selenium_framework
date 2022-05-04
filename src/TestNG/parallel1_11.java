package TestNG;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel1_11
{
	@Test
	public void p1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\automation testing\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
}