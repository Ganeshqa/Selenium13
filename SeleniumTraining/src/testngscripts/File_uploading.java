package testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class File_uploading extends Commonfunctionclass {

	@Test
	public static void uploadingfiles() throws InterruptedException {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		   if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			   
			   Thread.sleep(3000);
			   
			   driver.findElement(By.id("menu_pim_viewPimModule")).click();
			   
			   driver.findElement(By.id("btnAdd")).click();
			   
			   WebElement file=driver.findElement(By.name("photofile"));
			   
			                    file.sendKeys("C:\\Users\\Ganesh\\Desktop\\paint2.png");
		   }
		
	}
}

/*
 * <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TrainingTestSuite" annotations= "JDK" thread-count="1">

 
 <test name="Testing the functionality of actitime application">
 
 <parameter name="browsername" value="firefox"></parameter>
 
 <parameter name="url" value="https://opensource-demo.orangehrmlive.com"></parameter>
 
  
  <classes>

    
	 <class name="testngscripts.File_uploading"/> 
	
     
  </classes>

</test>

 
</suite>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
