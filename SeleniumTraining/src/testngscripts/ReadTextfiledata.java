package testngscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ReadTextfiledata {
	
	    static WebDriver driver;
	
	@Test
	public static void Readdata() throws IOException, InterruptedException {
		
		File f=new File("C:\\selenium13\\SeleniumTraining\\testdata.property");
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties obj=new Properties();
		
		obj.load(fis);
		
		  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
 		  driver=new FirefoxDriver();
 		  driver.get(obj.getProperty("url"));
 		  driver.manage().window().maximize();
 		  
 		  driver.findElement(By.id(obj.getProperty("useridlocator"))).sendKeys(obj.getProperty("userid"));
 		  
 		  driver.findElement(By.id(obj.getProperty("passwordlocator"))).sendKeys(obj.getProperty("password"));
 		  
 		  driver.findElement(By.id("btnLogin")).click();
 		  
 		      Thread.sleep(5000);
 		      
 		     driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		     
		     driver.findElement(By.id("btnAdd")).click();
		     
		     Select role1=new Select(driver.findElement(By.id("systemUser_userType")));
		     
		                  role1.selectByVisibleText(obj.getProperty("role"));
		                  
		      WebElement emp=driver.findElement(By.id("systemUser_employeeName_empName"));
		      
		            Actions builder=new Actions(driver);
		            
		                Action seriesofActions = builder
		                		
		                		.moveToElement(emp).click()
		                		
		                		.sendKeys(emp,obj.getProperty("empname"))
		                		
		                		.sendKeys(Keys.ENTER)
		                		
		                		.build();
		                
		                seriesofActions.perform();
		                
		                		
		           driver.findElement(By.id("systemUser_userName")).sendKeys(obj.getProperty("username"));
		           
		           driver.findElement(By.id("systemUser_password")).sendKeys(obj.getProperty("pwd"));
		           
		           driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(obj.getProperty("cpwd"));
		           
		           Thread.sleep(5000);
		           
		           driver.findElement(By.id("btnSave")).click();
 		  
	}

}
