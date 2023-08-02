package DriverFactory;

import java.beans.BeanProperty;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import LoginPageclass.loginPageclass;


public class testBase {
	protected WebDriver driver;
	protected loginPageclass loginpage;
	driverfactory df;
	protected Properties prop;
	
	@BeforeTest
	public void setup() {
		df=new driverfactory();
		prop =df.initprop();
		driver= df.initBrowser();
		loginpage =new loginPageclass(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
