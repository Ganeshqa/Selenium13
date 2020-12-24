package webdriverscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdownscript extends Launchbrowsers {

	public static void Dropdown() throws InterruptedException {
		
		 firefox("https://mail.rediff.com/cgi-bin/login.cgi"); // calling the method from launchbrowsers class
		 
		 driver.findElement(By.linkText("Create a new account")).click();
		 
		 Thread.sleep(3000);
		 
		 Select day=new Select(driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]")));
		 
		             day.selectByValue("05");
		             
		 Select month=new Select(driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]")));
		 
		              month.selectByVisibleText("FEB");
		              
		 Select year=new Select(driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')]")));
		 
		             year.selectByValue("2017");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		      Dropdown();
		
	}
}
