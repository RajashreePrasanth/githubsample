package LoginPageclass;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DriverFactory.testBase;

public class loginPageclass extends testBase{

	  WebDriver driver;
	 By email =By.xpath("//input[@id='input-email']");
	 By password =By.xpath("//input[@id='input-password']");
	 By submit_button= By.xpath("//input[@type='submit']");
	 By forgot_pwd=By.xpath("//div[@class='form-group']//a[contains(text(),'Forgotten Password')]");
	
	public loginPageclass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public boolean Isforgotpwdexist() {
		
		Boolean flag=driver.findElement(forgot_pwd).isDisplayed();
		return flag;
	}
	
	public   String getTitle() {
		String pageclaseTitle=driver.getTitle();
		System.out.println("pageclaseTitle" + pageclaseTitle); 
		return pageclaseTitle;
		
	}
	
	public  String getURL() {
		String pageclaseURL=driver.getCurrentUrl();
		return pageclaseURL;
		
	}
	
	public  void doLogin(String un, String pwd) {
		
	driver.findElement(email).sendKeys(un);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(submit_button).click();
	
	
	}
}
