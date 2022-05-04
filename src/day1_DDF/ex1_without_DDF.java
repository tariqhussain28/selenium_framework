package day1_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_without_DDF {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\testing\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://kite.zerodha.com/");
	
	d.findElement(By.xpath("//input[@id='userid']")).sendKeys("TR3583");
	d.findElement(By.xpath("//input[@id='password']")).sendKeys("Bhavi@2406");
	d.findElement(By.xpath("//button[contains(text(),'Login ')]")).click();
	
	d.findElement(By.xpath("//input[@id='pin']")).sendKeys("240621");
	d.findElement(By.xpath("//button[text()='Continue ']")).click();
	
	String actualresult=d.findElement(By.xpath("//span[@class='user-id']")).getText();
	String Expectedresult="TR3583";
	
	if(actualresult.equals(Expectedresult))
	{
		System.out.println("script successful");
	}
	
	else
	{
		System.out.println("script failed");
	}
	
	d.quit();
}
}
