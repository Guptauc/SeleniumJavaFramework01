package Pkg1st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");  
	    
        
		 WebDriver driver=new ChromeDriver();  
			
		 driver.get("http://demo.guru99.com/test/web-table-element.php");
		 
		 driver.manage().window().maximize();
		 
		 driver.wait(1000);
		 
		 List <WebElement> obj=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
	    String bfr="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
	    String afr="]/td[1]/a";
		 
		 
		 
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		  
		 
		 int x=obj.size();
		// System.out.println(x);
		 
		 for(int i=1;i<=x;i++)
		 {
			 String acl=driver.findElement(By.xpath(bfr+i+afr)).getText();
			 
			 System.out.println(acl);
			 
			 if (acl.equals("Jet Airways"));
			 {
			 driver.findElement(By.xpath(bfr+i+afr)).click();
			 break;
			 }
		 }
		 
		 driver.close();
		 
		
		 
		 
		 
		 
		 

	}

}
