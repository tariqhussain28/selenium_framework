package TestNG;

import org.testng.annotations.Test;

public class grouping_10 {
@Test(groups = "profile")
public void tc1()
{
	System.out.println("running profile tc 1");
}

@Test(groups = "profile")
public void tc2()
{
	System.out.println("running profile tc 2");
}

@Test(groups ="login")
public void tc3()
{
	System.out.println("running login tc 3");
	
}



}
