package webdriverscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/* step1: calling the firefox browser method from launchbrowserclass
 * step2: count no of options in dropdown
 * step3: retreive the country names from dropdown
 * step4: verify whether the country Australia is exist or not.
 * 
 */

public class Dropdown_count extends Launchbrowsers {

	public static void Dropdownmethod() {
		
		firefox("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.linkText("Create a new account")).click();
		
		Select country=new Select(driver.findElement(By.id("country")));
		
	    List<WebElement> country_count=	country.getOptions();
	    
	    System.out.println("no of countries in dropdown is="+country_count.size());
	    
	       for(int i=0;i<country_count.size();i++) {
	    	   
	    	   
	    	      WebElement countryname=  country_count.get(i);
	       
	    	      System.out.println("name of the country is="+countryname.getText());
	    	      
	    	          if(countryname.getText().equalsIgnoreCase("Australia")) {
	    	        	  
	    	        	  countryname.click();
	    	        	  
	    	        	  break;
	    	          }
	       }
	       
	       driver.findElement(By.xpath("//div[text()='Quality Control']")).click();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dropdownmethod(); 
	}

}
