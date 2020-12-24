package testngscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Handling_Frames extends Commonfunctionclass {

	
	@Test
	public static void Framemethod() throws InterruptedException {
		
		    List<WebElement> frame_count= driver.findElements(By.tagName("iframe"));
		    
		    Reporter.log("no of frames in application is="+frame_count.size(),true);
		    
		       for(WebElement frame: frame_count) {
		    	   
		    	   Reporter.log("name of the frame is="+frame.getAttribute("name"),true);
		       }
		       
		      // driver.switchTo().frame("packageListFrame");
		       
		       driver.switchTo().frame(0);
		       
		       driver.findElement(By.linkText("org.openqa.selenium")).click();
		       
		       driver.switchTo().defaultContent();
		       
		       Thread.sleep(5000);
		       
		       //driver.switchTo().frame("packageFrame");
		       
		       driver.switchTo().frame(1);
		       
		       driver.findElement(By.linkText("Alert")).click();
		       
		       driver.switchTo().defaultContent();
		       
		       Thread.sleep(5000);
		       
		       //driver.switchTo().frame("classFrame");
		       
		       driver.switchTo().frame(2);
		       
		       driver.findElement(By.linkText("accept")).click();
	}
}


/*

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TrainingTestSuite" annotations= "JDK" thread-count="1">

 
 <test name="Testing the functionality of actitime application">
 
 <parameter name="browsername" value="firefox"></parameter>
 
 <parameter name="url" value="https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html"></parameter>
 
  
  <classes>

    
	 <class name="testngscripts.Handling_Frames"/> 
	
     
  </classes>

</test>

 
</suite>














*/