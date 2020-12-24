package webdriverscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spiceject_signup {
	
	  static WebDriver driver;
	  
	  public static void Registration() {
		  
		  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("https://book.spicejet.com/Register.aspx");
		  driver.manage().window().maximize();
		  
		  Select title=new Select(driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle")));
		  
		               title.selectByValue("MR");
		               
		      driver.findElement(By.name("CONTROLGROUPREGISTERVIEW$PersonInputRegisterView$TextBoxFirstName")).sendKeys("samuel");
		      
		      driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys("joseph");

		      driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER")).sendKeys("9038448823");
		      
		      driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword")).sendKeys("samuel@1234");
		      
		      driver.findElement(By.name("CONTROLGROUPREGISTERVIEW$MemberInputRegisterView$PasswordFieldPasswordConfirm")).sendKeys("samuel@1234");
		      
		      driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")).sendKeys("samuel.joseph@gmail.com");
		      
		      driver.findElement(By.id("chkSpiceClubTnC")).click();
		      
		      driver.findElement(By.name("CONTROLGROUPREGISTERVIEW$ButtonSubmit")).click();
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Registration();
	}

}
