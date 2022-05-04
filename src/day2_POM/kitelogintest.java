package day2_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitelogintest {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "E:\\testing\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	
	
	kite_login1Page page1=new kite_login1Page(driver);
	page1.enterun();
	page1.enterpass();
	page1.pressloginbtn();
	
	kite_login2Page page2=new kite_login2Page(driver);
	page2.enterpin();
	page2.presscntbtn();
	
	kite_homePage page3=new kite_homePage(driver);
	page3.actualuserid();
	
	Thread.sleep(3000);
	driver.quit();
	
}
}
