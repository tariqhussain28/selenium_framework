package TestNG;

import org.testng.annotations.Test;

import graphql.VisibleForTesting;

public class keywords05
{
                                                     //1.invocation count
	@Test(invocationCount = 5)
	
	public void tc1()
	{
		System.out.println("running tc1");
	}
	


//------------------------------------------------------------------------------

                                                    //2.priority

@Test(priority = 1)

public void tc2()
{
	System.out.println("running tc2");
}

@Test(priority = -1)

public void tc3()
{
	System.out.println("running tc3");

}

@Test
public void tc4()
{
	System.out.println("running tc4");
}

//----------------------------------------------------------------------------
                                                       //3.enabled
@Test(enabled = false)
public void tc5()
{
	System.out.println("running tc5");
}


//.............................................................................

                                                        //4.timeout
@Test(timeOut = 5000)

public void tc6() throws InterruptedException
{
	Thread.sleep(5000);
	System.out.println("running tc6");
}

public void tc7()
{
	System.out.println("running tc7");
}


//------------------------------------------------------------------------------
                                                        //5.depends on method
@Test

public void tc8login()
{
	System.out.println("running tc8login");
}

@Test(dependsOnMethods = "tc8login" )

public void tc9logout()
{
	System.out.println("running tc9logout");
	
}












































}

