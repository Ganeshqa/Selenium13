package testngscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Capturescreenshot_failed extends Commonfunctionclass {
	
	
	@Test
	public static void uploadingfiles() throws InterruptedException, IOException {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		   if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			   
			   Thread.sleep(3000);
			   
			   driver.findElement(By.id("menu_pim_viewPimModule")).click();
			   
			   driver.findElement(By.id("btnAdd123")).click();
			   
			   WebElement file=driver.findElement(By.name("photofile"));
			   
			                    file.sendKeys("C:\\Users\\Ganesh\\Desktop\\paint2.png");
			                 
			              
			              
		   }
		
	}
	     
	     @AfterMethod
	     public void Screenshot(ITestResult result) {

	    	    if(ITestResult.FAILURE==result.getStatus()) {
	    	    	
	    	    	try {
	    	    		
	    	    		TakesScreenshot obj=(TakesScreenshot)driver;
	    	    		
	    	    		File source=obj.getScreenshotAs(OutputType.FILE);
	    	    		
	    	    		Files.copy(source, new File("C:\\selenium13\\SeleniumTraining\\screenshot\\application.png"));
	    	    	}
	    	    	
	    	    	catch(Exception e) {
	    	    		
	    	    		System.out.println(e.getMessage());
	    	    	}
	    	    }
	    	 
	     }
 
}


/*

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TrainingTestSuite" annotations= "JDK" thread-count="1">

 
 <test name="Testing the functionality of actitime application">
 
 <parameter name="browsername" value="firefox"></parameter>
 
 <parameter name="url" value="https://opensource-demo.orangehrmlive.com"></parameter>
 
  
  <classes>

    
	 <class name="testngscripts.Capturescreenshot_failed"/> 
	
     
  </classes>

</test>

 
</suite>













*/