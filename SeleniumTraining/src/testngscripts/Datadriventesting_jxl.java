package testngscripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Datadriventesting_jxl {
	
    static WebDriver driver;
    
    @Test(dataProvider="testdata")
    public static void signup(String fname,String lname,String mobile,String password,String date,String month,String year) throws InterruptedException {
   	 
   	 System.setProperty("webdriver.gecko.driver","geckodriver.exe");
   	 driver=new FirefoxDriver();
   	 driver.get("https://www.facebook.com/");
   	 driver.manage().window().maximize();
   	 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
   	 
   	 driver.findElement(By.id("u_0_2")).click();
   	 
   	 Thread.sleep(3000);
   	 
   	 driver.findElement(By.name("firstname")).sendKeys(fname);

   	 driver.findElement(By.name("lastname")).sendKeys(lname);
   	 
   	 driver.findElement(By.name("reg_email__")).sendKeys(mobile);
   	 
   	 driver.findElement(By.name("reg_passwd__")).sendKeys(password);
   	 
   	 Thread.sleep(3000);
   	 
   	 Select day=new Select(driver.findElement(By.id("day")));
   	 
   	             day.selectByValue(date);
   	             
   	 Select month1=new Select(driver.findElement(By.id("month")));
   	 
   	              month1.selectByVisibleText(month);
   	              
   	 Select year1=new Select(driver.findElement(By.id("year")));
   	 
   	              year1.selectByValue(year);
   	              
   	              
   	   driver.findElement(By.name("websubmit")).click();
   	              
   	              
   	   }
    
      @DataProvider(name="testdata")
      public String[][] ReadExeceldata() throws BiffException, IOException {
    	  
    	  File f=new File("C:\\Users\\Ganesh\\Desktop\\testdata.xls");
      
    	  Workbook wb=Workbook.getWorkbook(f);
    	  
    	  Sheet ws=wb.getSheet("Sheet2");
    	  
    	  int rows_count=ws.getRows();
    	  
    	  Reporter.log("no of rows in excel sheet is="+rows_count,true);
    	  
    	  int col_count=ws.getColumns();
    	  
    	  Reporter.log("no of colums in excel sheet is="+col_count,true);
    	  
    	  String data[][]=new String[rows_count][col_count];
    	  
    	       for(int i=0;i<rows_count;i++) {
    	    	   
    	    	   for(int j=0;j<col_count;j++) {
    	    		   
    	               Cell c= ws.getCell(j,i);
    	               
    	                 data[i][j]=  c.getContents();
    	    	   }
    	       }
			
    	       return data;
    	  
    	       
    	  
    	  
      }
    

    
    
}
