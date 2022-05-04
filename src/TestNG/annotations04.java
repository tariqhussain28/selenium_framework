package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations04 
{
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("open broswer",true);
	}
	
	
	
   @BeforeMethod
   public void logintoapp()
   {
	   Reporter.log("login to app",true);
   }
	
	
	
  @Test
  public void verifyuser1id()
  {
	  Reporter.log("running verify user1 id method",true);
  }
  
  
 @Test
  public void verifyuser2id()
  {
	  Reporter.log("running verify user2 id method",true);
  }
 
 @AfterMethod
 public void logout()
 {
	 Reporter.log("logout",true);
 }
 
 @AfterClass
 
 public void closebrowser()
 {
	 Reporter.log("close browser",true);
 }
 
}
