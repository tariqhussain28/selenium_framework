package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertiondisAdvantag07 
{

	//in one method/tc if we have multiple varification 1st will be executed
	//if it fails program wont execute next verifications in same method
	
	@Test
	public void disAdvantagOfAssertClass()
	{
		String actResult="Hi";
		String expResult="Hello";
		Assert.assertEquals(actResult, expResult,"Failed1: both results are diff: ");
		
		
		boolean actResult1=false;
		Assert.assertTrue(actResult1,"Failed2: actResult is false");
		
		
	}
	
	
}
