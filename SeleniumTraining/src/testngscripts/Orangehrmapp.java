package testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
TC1: check the functionality add button

step1: Enter the url and valid login details --- BeforeMethod
step2: verify the functionality of Add button under admin module  --- @Test(priority=0)
step3: check logout functionality   -- AfterMethod


TC2: check the functionality search button

step1: Enter the url and valid login details
step2: verify the functionality of search button under admin module -- @Test(priority=1
step3: check logout functionality 

TC3: check the functionality DELETE button

step1: Enter the url and valid login details
step2: verify the functionality of DELETE button under admin module -- @Test(priority=2)
step3: check logout functionality 


TC4: check the functionality RESET button

step1: Enter the url and valid login details
step2: verify the functionality of RESET button under admin module -- @Test(priority=3)
step3: check logout functionality 
 * 
 */

public class Orangehrmapp {
	
	   static WebDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public static void Login(String url,String username,String password) {
		
		  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("txtUsername")).sendKeys(username);
		  
		  driver.findElement(By.id("txtPassword")).sendKeys(password);
		  
		  driver.findElement(By.id("btnLogin")).click();
		  
		  
		 }
	
	@Test(priority=0)
	public static void Addbutton() throws InterruptedException {
		
		     Thread.sleep(3000);
		
		   if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			   
			     driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			     
			     driver.findElement(By.id("btnAdd")).click();
			     
			     Select role=new Select(driver.findElement(By.id("systemUser_userType")));
			     
			                  role.selectByVisibleText("Admin");
			                  
			      WebElement empname=driver.findElement(By.id("systemUser_employeeName_empName"));
			      
			            Actions builder=new Actions(driver);
			            
			                Action seriesofActions = builder
			                		
			                		.moveToElement(empname).click()
			                		
			                		.sendKeys(empname,"Fiona Grace")
			                		
			                		.sendKeys(Keys.ENTER)
			                		
			                		.build();
			                
			                seriesofActions.perform();
			                
			                		
			           driver.findElement(By.id("systemUser_userName")).sendKeys("fiona@45667");
			           
			           driver.findElement(By.id("systemUser_password")).sendKeys("fiona@1234");
			           
			           driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("fiona@1234");
			           
			           Thread.sleep(5000);
			           
			           driver.findElement(By.id("btnSave")).click();
			           
			           Reporter.log("employee information added successfully into webtable",true);
			     
		   }
		   
		   else {
			   
			        Reporter.log("unable to add employee info",true);
		   }
		   
		   
	}
	
	  @Test(priority=1)
	  public static void searchbutton() throws InterruptedException {
		  
		     Thread.sleep(3000);
		     
		     
		     driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		     
		     driver.findElement(By.id("searchSystemUser_userName")).sendKeys("fiona@45667");
		     
		     driver.findElement(By.id("searchBtn")).click();
		  
	  }
	  
	  @Test(priority=2)
	  public static void Resetbutton() throws InterruptedException {
		  
		     // calling searchbutton method
		  
		      searchbutton();
		      
		      driver.findElement(By.id("resetBtn")).click();
	  }
	  
	  @Test(priority=3)
	  public static void Deletebutton() throws InterruptedException {  
		  
		   // calling searchbutton method
		  
		  searchbutton();
		  
		     WebElement checkbox=driver.findElement(By.id("ohrmList_chkSelectAll"));
		     
		                          checkbox.click();
		                          
		                     if(checkbox.isSelected()) {
		                    	 
		                      driver.findElement(By.id("btnDelete")).click();
		                      
		                         Thread.sleep(3000);
		                      
		                        driver.findElement(By.id("dialogDeleteBtn")).click();
		                        
		                        Reporter.log("emp information delete successfully",true);
		                     }
		                     
		                     else {
		                    	 
		                    	 Reporter.log("unable to delete emp info from webtable",true);
		                     }
		                  
		  
	  }
	
	   @AfterMethod
	   public static void Logout() throws InterruptedException {
		   
		       Thread.sleep(3000);
		       
		       driver.findElement(By.id("welcome")).click();
		       
		       Thread.sleep(3000);
		       
		       driver.findElement(By.xpath("//a[contains(@href,'/index.php/auth/logout')]")).click();
	   }
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
