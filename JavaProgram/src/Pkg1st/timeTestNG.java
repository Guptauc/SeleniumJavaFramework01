package Pkg1st;

import org.testng.annotations.Test;

public class timeTestNG {

	@Test(invocationTimeOut=2000)
	
	public void A1()
	
	{
		int i=1;
		while(i==1)
			System.out.println(i);
	}
	
}
