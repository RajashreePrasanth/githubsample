package loginPageTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Base64;

import org.testng.Assert;
import org.testng.annotations.Test;

import DriverFactory.testBase;
import LoginPageclass.loginPageclass;
  

public class loginpageTest extends testBase{
	
	@Test
	public void getTitleTest() {
		String act_title=loginpage.getTitleLoginPage();
		Assert.assertEquals(act_title, "Account Login");
		System.out.println("Test passed");
		
		
	}
	@Test
	public void getURL() {
		String act_url=loginpage.getURL();
		Assert.assertTrue(act_url.contains("route=account/login"));
		System.out.println("Test");
		
		
	}
	
	
}