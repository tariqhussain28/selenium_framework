package day3_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitelogintest
{
    public static void main(String[] args) throws InterruptedException
    {

    	System.setProperty("webdriver.chrome.driver", "E:\\testing\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.get("https://kite.zerodha.com/");
    	
    	kitelogin1page page1=new kitelogin1page(driver);
    	page1.inpkitelogin1pageusername();
    	page1.inpkitelogin1pagepassword();
    	page1.clickkitelogin1pageloginbtn();
    	
    	
    	kitelogin2page page2=new kitelogin2page(driver);
    	page2.inpkitelogin2pagepin();
    	page2.clickkitelogin2pagecontinuebtn();
    	
    	kitehomepagepage page3=new kitehomepagepage(driver);
    	page3.verifykitehomepageuserid();
    	
    	Thread.sleep(3000);
    	
    	driver.close();
    	
    	
	}
	
	
}
