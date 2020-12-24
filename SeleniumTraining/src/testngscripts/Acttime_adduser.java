package testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class Acttime_adduser extends Commonfunctionclass {
	
	  
	   
	   @Test(priority=0)
	   public static void Login() {
		   
		    driver.findElement(By.id("username")).sendKeys("admin");
		    
		    driver.findElement(By.name("pwd")).sendKeys("manager");
		    
		    driver.findElement(By.id("loginButton")).click();
	   }
	   
	   @Test(priority=1)
	   public static void Adduser() throws InterruptedException {
		   
		      Thread.sleep(5000);
		   
		     driver.findElement(By.id("container_users")).click();
		     
		     Thread.sleep(3000);
		     
		     driver.findElement(By.className("components_button_label")).click();
		     
		     Thread.sleep(3000);
		     
		     driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("samuel");
		     
		     driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("joseph");
		     
		     driver.findElement(By.id("createUserPanel_emailField")).sendKeys("samuel.joseph@gmai.com");
		     
		     driver.findElement(By.xpath("//div[text()='-- department not assigned --']")).click();
		     
		     Thread.sleep(3000);
		     
		     driver.findElement(By.xpath("//div[text()='-- new department --']")).click();
		     
		     Thread.sleep(5000);
		     
		     WebElement department =driver.findElement(By.className("newGroupInput"));
		     
		          if(department.isDisplayed()) {
		     
		     Actions builder=new Actions(driver);
					     
		        Action seriesofActions = builder
             		
             		.moveToElement(department).click()
             		
             		.sendKeys(department,"testing department")
             		
             		.sendKeys(Keys.ENTER)
             		
             		.build();
             
             seriesofActions.perform();
		     
		          }
		           
		          else {
		        	  
		        	  Reporter.log("department name does not exist",true);
		          }
		     
		     driver.findElement(By.className("components_button_label")).click();
		     
		     
	   }
	   
	   @Test(priority=2)
	   public static void Logout() throws InterruptedException {
		   
		      Thread.sleep(5000);
		      
		      driver.findElement(By.id("logoutLink")).click();
	   }
	

}
