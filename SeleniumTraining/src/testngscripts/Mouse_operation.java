package testngscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mouse_operation extends Commonfunctionclass {
	
	@Test
	public static void Addons() throws InterruptedException {
		
		WebElement addons=driver.findElement(By.id("header-addons"));
		
		    Actions obj=new Actions(driver);
		    
		    obj.moveToElement(addons).perform();
		    
		      List<WebElement> links=driver.findElements(By.xpath("//*[@id='header-addons']/ul/li/a"));
		      
		      Reporter.log("no of link in addons menu is="+links.size(),true);
		      
		          for(int i=0;i<links.size();i++) {
		        	  
		        	  
		        	      WebElement linkname=  links.get(i);
		          
		        	      Reporter.log("name of the link is="+linkname.getAttribute("innerHTML"),true);
		        	      
		          }
		          
		          Thread.sleep(3000);
		          
		          driver.findElement(By.xpath("//*[@id='header-addons']/ul/li[2]/a")).click();
		          
		          
		
		
	}

}


/*

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TrainingTestSuite" annotations= "JDK" thread-count="1">

 
 <test name="Testing the functionality of actitime application">
 
 <parameter name="browsername" value="firefox"></parameter>

<parameter name="url" value="https://book.spicejet.com/"></parameter>
   
  <classes>

    
	 <class name="testngscripts.Mouse_operation"/> 
	
     
  </classes>

</test>

 
</suite>













*/