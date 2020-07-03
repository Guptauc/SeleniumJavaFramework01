package Pkg1st;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	SoftAssert obj=new SoftAssert();
	
	@Test
	public void Asrt()
	
	{
		System.out.println("1st");
		String A="title";
		
	 obj.assertEquals(true, false);
		System.out.println("11st");
		obj.assertAll();
	}
	
	@Test
	public void Asrt1()
	{
		Assert.assertEquals(true, false);
		
		System.out.println("2nd");
		obj.assertAll();
	}
	
	@Test
	public void Asrt2()
	{
		System.out.println("3rd");
	}

}
