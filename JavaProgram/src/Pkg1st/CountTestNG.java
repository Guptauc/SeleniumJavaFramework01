package Pkg1st;

import org.testng.annotations.Test;

public class CountTestNG {
	
	
	@Test(invocationCount=10)
	public void A1()
	{
		System.out.println("!st");
	}

}
