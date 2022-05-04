package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert08
{
	
	
	@Test
	public void softasset()
	{
	SoftAssert soft=new SoftAssert();
	
	String act="aaaa";
	String exp="bbbbbb";
	soft.assertEquals(act,exp,"<failed1>");
	
	String actual=null;
	soft.assertNotNull(actual,"<failed2>");
	
	soft.assertAll();  //if we dont mention it program wont get properly executed
	
	}

}
