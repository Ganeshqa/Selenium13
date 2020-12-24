package webdriverscripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launchbrowsers {
	
	     static WebDriver driver;
	
	 public static void firefox(String url) {
		 
		 System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
	 }
	 
	 public static void chrome() {
		 
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
	 }
	 
	 public static void IE() {
		 
		 System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
	 }

	 public static void Navigation() throws InterruptedException {
		 
		  firefox("http://www.google.com"); // calling firefox method
		  
		  Thread.sleep(5000);
		  
		  driver.navigate().to("http://www.facebook.com");
		  
		  Thread.sleep(5000);
		  
		  driver.navigate().back();
		  
		  Thread.sleep(5000);
		  
		  driver.navigate().forward();
		  
		  Thread.sleep(5000);
		  
		  driver.navigate().refresh();
		  
		  Thread.sleep(5000);
		  
		  driver.close();
		  
		  
	 }
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		     //firefox();
		     //chrome();
		     //IE();
		     Navigation();
	}

}
