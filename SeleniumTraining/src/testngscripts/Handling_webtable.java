package testngscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Handling_webtable extends Commonfunctionclass {

	@Test
	public static void WebTable() throws InterruptedException {
		
		driver.findElement(By.linkText("Learn HTML")).click();
		
		driver.findElement(By.linkText("HTML Tables")).click();
		
		Thread.sleep(3000);
		
		 WebElement table= driver.findElement(By.id("customers"));
		 
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

/*
 * <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TrainingTestSuite" annotations= "JDK" thread-count="1">

 
 <test name="Testing the functionality of actitime application">
 
 <parameter name="browsername" value="firefox"></parameter>
 
 <parameter name="url" value="https://www.w3schools.com"></parameter>
 
  
  <classes>

    
	 <class name="testngscripts.Handling_webtable"/> 
	
     
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
 * 
 * 
 */
 