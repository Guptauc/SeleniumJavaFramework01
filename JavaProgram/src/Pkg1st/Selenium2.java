package Pkg1st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium2 {

	//public static void main(String[] args) {
	
	
	@BeforeSuite
	
	public void setup()
	{
		System.out.println("Setup");
	}
	
@BeforeTest
	
	public void login()
	{
		System.out.println("login");
	} 

	@BeforeClass
	
	public void lauchBriwser()
	{
		System.out.println("Ujjwal");
		
	}
	
	
	@BeforeMethod
	
	public void enterurl()
	{
		System.out.println("Guptaurl");
	}
		
	@Test
	
	public void googletitle()
	{
		System.out.println("title");
	}
	
	@AfterMethod
	
	public void logout()
	{
		System.out.println("logout");
	}
	
	@AfterClass
	public void dlt()
	{
		System.out.println("dltallcooks");
	}
	
	@AfterTest
	public void closebrser()
	{
		System.out.println("closebrwser");
	}
	
	@AfterSuite
	public void gnrtreport()
	{
		System.out.println("gnrtrpt");
	}
	
	
	
	
	
	
	
		
		
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");  
//	    
//        
//		 WebDriver driver=new ChromeDriver();  
//			
//		 driver.get("https://aajtak.intoday.in/");
//		 driver.close();

	}


