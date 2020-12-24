package testngscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriventesting_Dataprovider {
	
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
	     public String[][] getdata() {
	    	 
	    	 String[][] data=new String[3][7];
	    	 
	    	   data[0][0]="samuel";
	    	   data[0][1]="john";
	    	   data[0][2]="9074747332";
	    	   data[0][3]="mercury1234";
	    	   data[0][4]="2";
	    	   data[0][5]="Jun";
	    	   data[0][6]="2009";
	    	   
	    	   
	    	   data[1][0]="Joesph";
	    	   data[1][1]="Michael";
	    	   data[1][2]="90747332";
	    	   data[1][3]="mercury123";
	    	   data[1][4]="3";
	    	   data[1][5]="Feb";
	    	   data[1][6]="2010";
	    	   
	    	   data[2][0]="Rahul";
	    	   data[2][1]="kiran";
	    	   data[2][2]="90473321";
	    	   data[2][3]="mercury234";
	    	   data[2][4]="4";
	    	   data[2][5]="Aug";
	    	   data[2][6]="2008";
			
	    	   return data;
	    	   
	    	   
	     }
	     

}
