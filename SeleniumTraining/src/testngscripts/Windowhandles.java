package testngscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Windowhandles extends Commonfunctionclass {

	/* step1: calling launchbrowser method from commonfunctionclass
	 * step2: handling parent window and it will generate parentwindow id
	 * step3: Handling multiple windows
	 * step4: verifying the parent window is not equals to child window
	 * 
	 */
	
	@Test
	public static void Handlingwindow() throws InterruptedException {
		
		
		     String parentwindow= driver.getWindowHandle();
		
		     Reporter.log("the parentwindow id is="+parentwindow,true);
		     
		     Thread.sleep(3000);
		     
		     Set<String>multiplewindow= driver.getWindowHandles();
		     
		     Thread.sleep(3000);
		     
		     Reporter.log("no of windows handling is="+multiplewindow.size(),true);
		     
		          for(String child:multiplewindow) {
		        	  
		        	       if(!parentwindow.equalsIgnoreCase(child)) {
		        	    	   
		        	    	   driver.switchTo().window(child);
		        	    	   
		        	    	      Thread.sleep(3000);
		        	    	      
		        	    	      Reporter.log("the title of child window is="+driver.getTitle(),true);
		        	    	      
		        	    	      if(driver.getTitle().equalsIgnoreCase("Cognizant")) {
		        	    	    	  
		        	    	    	   Thread.sleep(3000);
				        	    	      
				        	    	      driver.close();
		        	    	    	  
		        	    	      }
		        	    	      
		        	    	   
		        	       }
		          }
		          
		                driver.switchTo().window(parentwindow);
		                
		                driver.findElement(By.name("keyword")).sendKeys("selenium");
		                
		                driver.findElement(By.name("location")).sendKeys("chennai");
		                
		                driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		                
		                Reporter.log("the title of parent window is="+driver.getTitle(),true);
		                
	}
}
