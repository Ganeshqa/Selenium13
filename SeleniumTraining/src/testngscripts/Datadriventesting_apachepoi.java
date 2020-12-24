package testngscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Datadriventesting_apachepoi {
	
	  static WebDriver driver;
	  
	  @Test
	  public static void Readexceldata() throws IOException, InterruptedException {
		  
		  File f=new File("C:\\Users\\Ganesh\\Desktop\\testdata.xls");
	  
		  FileInputStream fis=new FileInputStream(f);
		  
		  HSSFWorkbook wb=new HSSFWorkbook(fis);
		  
		  HSSFSheet ws=wb.getSheet("Sheet3");
	  
		   int rows_count= ws.getLastRowNum()+1;
	  
		   Reporter.log("no of rows in excel sheet is="+rows_count,true);
		   
		   int col_count=ws.getRow(0).getPhysicalNumberOfCells();
		   
		   Reporter.log("no of colums in excel sheet is="+col_count,true);
		   
		       for(int i=1;i<rows_count;i++) {
		    	   
		    	    
		    	   String userid= ws.getRow(i).getCell(0).getStringCellValue();
		    	
		    	   String password= ws.getRow(i).getCell(1).getStringCellValue();
		    	   
		    	   String role=ws.getRow(i).getCell(2).getStringCellValue();
		    	   
		    	   String empname=ws.getRow(i).getCell(3).getStringCellValue();
		    	   
		    	   String username=ws.getRow(i).getCell(4).getStringCellValue();
		    	   
		    	   String pwd=ws.getRow(i).getCell(5).getStringCellValue();
		    	   
		    	   String cpwd=ws.getRow(i).getCell(6).getStringCellValue();
		    	   
		    	  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		 		  driver=new FirefoxDriver();
		 		  driver.get("https://opensource-demo.orangehrmlive.com/");
		 		  driver.manage().window().maximize();
		 		  
		 		  driver.findElement(By.id("txtUsername")).sendKeys(userid);
		 		  
		 		  driver.findElement(By.id("txtPassword")).sendKeys(password);
		 		  
		 		  driver.findElement(By.id("btnLogin")).click();
		 		  

				     Thread.sleep(3000);
				
				   if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
					   
					     driver.findElement(By.id("menu_admin_viewAdminModule")).click();
					     
					     driver.findElement(By.id("btnAdd")).click();
					     
					     Select role1=new Select(driver.findElement(By.id("systemUser_userType")));
					     
					                  role1.selectByVisibleText(role);
					                  
					      WebElement emp=driver.findElement(By.id("systemUser_employeeName_empName"));
					      
					            Actions builder=new Actions(driver);
					            
					                Action seriesofActions = builder
					                		
					                		.moveToElement(emp).click()
					                		
					                		.sendKeys(emp,empname)
					                		
					                		.sendKeys(Keys.ENTER)
					                		
					                		.build();
					                
					                seriesofActions.perform();
					                
					                		
					           driver.findElement(By.id("systemUser_userName")).sendKeys(username);
					           
					           driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
					           
					           driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpwd);
					           
					           Thread.sleep(5000);
					           
					           driver.findElement(By.id("btnSave")).click();
					         
					           ws.getRow(i).createCell(7).setCellValue("employee information added successfully into webtable");
					           
					           FileOutputStream fout=new FileOutputStream(f);
					           
					              wb.write(fout);
					              
					              
					          
					     
				   }
				   
				   else {
					   
					      ws.getRow(i).createCell(7).setCellValue("invalid information details entered");
				           
				           FileOutputStream fout=new FileOutputStream(f);
				           
				              wb.write(fout);
				   }
				   
		       
		       }
	  }

}
