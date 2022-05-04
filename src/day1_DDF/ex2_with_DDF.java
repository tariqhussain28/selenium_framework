package day1_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_with_DDF {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\testing\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://kite.zerodha.com/");
	
	FileInputStream file=new FileInputStream("E:\\testing\\SELENIUM\\seleniumframework1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("day1");
	
	
	
	d.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
	d.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
	d.findElement(By.xpath("//button[contains(text(),'Login ')]")).click();
	
	d.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(1).getCell(2).getStringCellValue());
	d.findElement(By.xpath("//button[text()='Continue ']")).click();
	
	String actualresult=d.findElement(By.xpath("//span[@class='user-id']")).getText();
	String Expectedresult=sh.getRow(1).getCell(0).getStringCellValue();
	
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
