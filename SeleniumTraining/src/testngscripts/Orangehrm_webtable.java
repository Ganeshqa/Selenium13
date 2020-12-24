package testngscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Orangehrm_webtable extends Commonfunctionclass {

	
	@Test
	public static void uploadingfiles() throws InterruptedException {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		   if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			   
			   Thread.sleep(3000);
			   
			   driver.findElement(By.id("menu_pim_viewPimModule")).click();
			   
			   
			   Thread.sleep(3000);
				
				 WebElement table= driver.findElement(By.id("resultTable"));
				 
				 /* counting no rows in webtable
				  */
				 
				 List<WebElement> tr_rows=    table.findElements(By.tagName("tr"));
				 
				 Reporter.log("no of rows in webtable is="+tr_rows.size(),true);
				 
				 // count no of colums in webtable with the tagname th
				 
				     
				 List<WebElement>tc_colums= table.findElements(By.tagName("th"));
				 
				 Reporter.log("no of colums in webtable is="+tc_colums.size(),true);
				 
				     int row_num=1;
				 
				      for(WebElement trelement:tr_rows) {
				    	  
				    	  List<WebElement> td_count= trelement.findElements(By.tagName("td"));
				      
				    	 int col_num=1;
				    	 
				    	 
				    	for(WebElement tdelement: td_count) {
				    		
				    		Reporter.log("row="+row_num+",col="+col_num+",text="+tdelement.getText(),true);
				    		
				    		col_num++; //2
				    	}
				    	  
				    	   row_num++;
				    	 
				      }
				                 
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

    
	 <class name="testngscripts.Orangehrm_webtable"/> 
	
     
  </classes>

</test>

 
</suite>
 * 
 * 
 */
