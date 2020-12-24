package testngscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Alert_script extends Commonfunctionclass {

	@Test
	public static void Alertmethod() throws InterruptedException {
		
		driver.findElement(By.linkText("New Registration")).click();
		
		Thread.sleep(3000);
		
		if(isTextPresent("Registration")) {
			
			Reporter.log("expected text is present in an application",true);
			
			driver.findElement(By.id("txtname")).sendKeys("sam");
			
			driver.findElement(By.id("txtphone")).sendKeys("7747488384");
			
			driver.findElement(By.id("txtemail")).sendKeys("sam.qa23@gmail.com");
			
			driver.findElement(By.id("btnRegister")).click();
			
      if(isAlertPresent()) {
    	  
    	  Reporter.log("There is an alert present in an application",true);
      
    	      Alert obj=driver.switchTo().alert();
    	      
    	      
    	        String message= obj.getText();
      
    	        Reporter.log(message);
    	        
    	        Thread.sleep(5000);
    	        
    	        obj.accept();
      
    	        
      }
      
      else {
    	  
    	  Reporter.log("There were no such alert present in an application",true);
      }
      
          driver.findElement(By.id("txtloginid")).sendKeys("sam_qa23");
          
          driver.findElement(By.id("txtpassword")).sendKeys("samuel@1234");
      
		}
		
		else {
			
			Reporter.log("no such text present in an application",true);
		}
		
	}
}
