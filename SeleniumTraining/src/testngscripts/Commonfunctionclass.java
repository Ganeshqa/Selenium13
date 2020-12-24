package testngscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Commonfunctionclass {
	
	   static WebDriver driver;
	
	@Parameters({"browsername","url"})
	@BeforeClass
	public static void Launchbrowser(String browsername,String url) {
	
		    if(browsername.equalsIgnoreCase("firefox")) {
		    	
		    	 Reporter.log("Launching an application in a browser="+browsername,true);
		         System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		         driver=new FirefoxDriver();
		         
		    }
		    
		    else if(browsername.equalsIgnoreCase("chrome")) {
		    	
		    	 Reporter.log("Launching an application in a browser="+browsername,true);
		         System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		         driver=new ChromeDriver();
		    }
		    
		    else if(browsername.equalsIgnoreCase("IE")) {
		    	
		    	 Reporter.log("Launching an application in a browser="+browsername,true);
		         System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
		         driver=new InternetExplorerDriver();
		    }
		    
		    else {
		    	
		    	 Reporter.log("Launching an application in a default browser",true);
		         System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		         driver=new FirefoxDriver();
		   
		    }
		    
		        driver.get(url);
		        
		        driver.manage().window().maximize();
		        
		        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	}

	  /*  @AfterClass
	    public static void Closebrowser() throws InterruptedException {
	    	
	    	    Thread.sleep(10000);
	    	    
	    	    driver.quit();
	    }*/
	
public static boolean isTextPresent(String textToVerify) {	
		
		String bodyText;
		
		bodyText = driver.findElement(By.tagName("body")).getText(); 
		
		if (bodyText.contains(textToVerify)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isAlertPresent() {		
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
}
