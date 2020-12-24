package testngscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Acttimeapp {

	   static WebDriver driver;
	   
	  
	   @Test(priority=0)
	   public static void Launchbrowser() {
		   
		   System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.get("https://demo.actitime.com/login.do");
		   driver.manage().window().maximize();
		   
		  
		   
	   }
	
	  @Test(priority=1)
	  public static void Login() {
		  
		  WebElement username=driver.findElement(By.id("username"));
		  
		  WebElement loginbutton=driver.findElement(By.id("loginButton"));
		  
		            if(username.isDisplayed()) {
		            	
		            	if(loginbutton.isEnabled()) {
		            		
		            		   username.sendKeys("admin");
		            		   
		            		   driver.findElement(By.name("pwd")).sendKeys("manager");
		            		   
		            		   loginbutton.click();
		            		   
		            		   Reporter.log("actitime login successfully into home page",true);
		            		   
		            		  		   
		            	}
		            }
		            
		            else {
		            	
		            	  Reporter.log("unable to login into acttime home page",true);
		            }
		            
	  }
	
	   @Test(priority=2)
	   public static void verifypagetitle() throws InterruptedException {
		   
		         Thread.sleep(3000);
		   
		        String exptitle="actiTIME - Login";
		        
		        String acttitle=driver.getTitle();
		        
		        Reporter.log(acttitle,true);
		        
		        if(exptitle.equalsIgnoreCase(acttitle)) {
		        	
		        	Reporter.log("exptitle is matching with actual title",true);
		        }
		        
		        else {
		        	
		        	Reporter.log("exptitle is not matching with actual title",true);
		        }
	   }
	  
	  @Test(priority=3)
	   public static void NewTask() throws InterruptedException {
		   
		      Thread.sleep(5000);
		      
		      driver.findElement(By.xpath("//span[contains(text(),'New')]")).click();
		      
		      Thread.sleep(5000);
		      
		      driver.findElement(By.xpath("//div[contains(text(),'- Select Customer -')]")).click();
		      
		      //Thread.sleep(3000);
		      
		      driver.findElement(By.xpath("//div[contains(text(),'Galaxy Corporation')]")).click();
		      
		      driver.findElement(By.xpath("//div[contains(text(),'- Select Project -')]")).click();
		      
		      driver.findElement(By.xpath("//div[contains(text(),'Android testing')]")).click();
		      
		       //Thread.sleep(3000);
		       
		       driver.findElement(By.id("closeCreateTasksPopupButton")).click();
		       
		             if(IsAlertPresent()) {
		            	 
		            	 Alert alert=driver.switchTo().alert();
		            	 
		            	 String alertmessage=    alert.getText();
		             
		            	 Reporter.log(alertmessage,true);
		            	 
		             	 Thread.sleep(5000);
		            	 
		            	 alert.accept();
		            	 
		            	 Reporter.log("Alert is present in an application",true);
		             }
		      
		             else {
		            	 
		            	 Reporter.log("No such alert present in an application",true);
		             }
	   }
	  
	   
	     @Test(priority=4)
	     public static void Logout() throws InterruptedException {
	    	 
	    	       Thread.sleep(5000);
	    	       
	    	       driver.findElement(By.id("logoutLink")).click();
	     }
	    
	  
	  
	 	public static boolean IsAlertPresent() {		
			try {
				driver.switchTo().alert();
				return true;
			} catch (NoAlertPresentException e) {
				return false;
			}
		}

	  
}
