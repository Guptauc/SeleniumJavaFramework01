package Pkg1st;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programjava2 {

	public static void A {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");  
	    
        
		 WebDriver driver=new ChromeDriver();  
			
		 driver.get("https://www.seleniumeasy.com/test/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[@class='at4-close']")).click();
		 
		driver.findElement(By.xpath("//a[@type='false']")).click();
		 
		 
}
}
