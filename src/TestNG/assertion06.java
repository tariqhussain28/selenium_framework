package TestNG;



import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion06 
{

	@Test
	public void asserteql()
	{
		String actual="hello";
		String expect="hi";
		
	Assert.assertEquals(actual, expect);
	//	Assert.assertEquals(actual, expect,"failed 2 tc");
	}
	
	@Test
	public void assernotequal()
	{
		String act="hello";
		String exp="hi";
		
		//Assert.assertEquals(act, exp);
		Assert.assertEquals(act, exp,"failed 2 cases");
	}
	
	@Test
	public void asserttru()
	{
		boolean exp=true;
		Assert.assertTrue(exp);
	}
	
	
	@Test
	public void assertfalse()
	{
		boolean exp=false;
		Assert.assertFalse(exp,"<falied 2>");
	}
	
	
	@Test
	public void assertnull()
	{
		String s=null;
		Assert.assertNull(s);
	}
	
	
	@Test
	public void assertnotnull()
	{
		String s=null;
		Assert.assertNotNull(s);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
