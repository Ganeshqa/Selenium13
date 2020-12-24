package testngscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Handlingtabs extends Commonfunctionclass {
	
	@Test
	public static void Tabs() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'SME Travel')]")).click();
		
		Thread.sleep(3000);
		
		switchtotab(0);
		
		Thread.sleep(3000);
		
		switchtotab(1);
		
		driver.findElement(By.id("UserName")).sendKeys("ganesh.qa1@gmail.com");
		
		driver.findElement(By.id("LoginPassword")).sendKeys("mercury@123");
		
		driver.findElement(By.id("btnSignin")).click();
		
		Thread.sleep(3000);
		
		switchtotab(0);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Manage Booking')]")).click();
		
		switchtotab(0);
		
		driver.findElement(By.id("ControlGroupRetrieveBookingHomeView_BookingRetrieveInputRetrieveBookingHomeView_ConfirmationNumber")).sendKeys("3646464");
		
		driver.findElement(By.id("ControlGroupRetrieveBookingHomeView_BookingRetrieveInputRetrieveBookingHomeView_CONTACTEMAIL1")).sendKeys("ganesh.qa1@gmail.com");
		
		driver.findElement(By.id("ControlGroupRetrieveBookingHomeView_BookingRetrieveInputRetrieveBookingHomeView_ButtonRetrieve")).click();
		
		
		
		
		}
	
	
	  public static void switchtotab(int index) {     //  1
		  
		    String window=null;
		  
		   Set<String> tabs=    driver.getWindowHandles();    // 2
		   
		   Iterator<String> obj=tabs.iterator();  
		   
		   for(int i=0;i<=index;i++) {
			   
			   window=  obj.next();
		   }
		   
		      driver.switchTo().window(window);
		   
		   
		   
	  }

}
