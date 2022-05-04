package baseutilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass {
	
	//this method is used to take screenshot having 2 parameter: 1.wedbriver name 2.integer testcaseid
	//designedby @tariqhussain
public static void screenshot(WebDriver driver, int tcid) throws EncryptedDocumentException, IOException
{
	File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File de=new File("\"E:\\testing\\automation testing\\SELENIUM\\Screenshot"+tcid+".jpg");
	FileHandler.copy(sc, de);
}


//this method is used to get string data from excel sheet method has 2 parameters rowindex and cellindex
//designed by@tariqhussain
public static String excel(int rindex,int cindex) throws IOException
{
	FileInputStream file=new FileInputStream("E:\\testing\\automation testing\\SELENIUM\\seleniumframework1.xlsx");
	String value = WorkbookFactory.create(file).getSheet("day1").getRow(rindex).getCell(cindex).getStringCellValue();
	return value;
}


}
