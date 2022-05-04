package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailablereport03 
{
	@Test
	public void m1()
	{
		Reporter.log("running method m1",true); //print msg both in console+ emailable report
	}
	
	
	@Test
	public void m2() ////print msg both in console+ emailable report
	{
		Reporter.log("running method m2",true);
	}
	
	@Test
	
	public void m3()
	{
		Reporter.log("running method m3",false); //print msg only in emilable report not in console
	}
	
	@Test
	public void m4()
	{
		Reporter.log("running method m4"); //print msg only in emilable report not in console
	}

}
