package Pkg1st;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {
	
	WebDriver driver;
	
	@Test
	@Parameters({"username","password"})
	public void login(String username,String password ) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");  
	       
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://the-internet.herokuapp.com/login");
		  
		 
		  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
		//  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		 // driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
	}
	

}
