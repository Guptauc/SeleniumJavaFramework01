package Pkg1st;

import org.testng.annotations.Test;

public class TestNGExa1 {
	
	
	@Test
	public void A1()
	{
		System.out.println("1st methos");
		
		int x=10/0;
	}
	
	@Test(dependsOnMethods="A3")
	public void A2()
	{
		System.out.println("2nd method");
	}
	
	@Test(dependsOnMethods="A1")
	public void A3()
	{
		System.out.println("3rd method");
	}

}
