package Pkg1st;

import org.testng.annotations.Test;

public class ignotTestng {
	
	@Test
	public void A()
	{
		System.out.println("1st");
	}
	
	@Test(enabled=true)
	public void A1()
	{
		System.out.println("2nd");
	}
	
	@Test
	public void A2()
	{
		System.out.println("3rd");
	}

}
