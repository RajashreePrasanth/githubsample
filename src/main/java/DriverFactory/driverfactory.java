package DriverFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverfactory {
	
	WebDriver driver;
	Properties prop;
	
	public WebDriver initBrowser(String browserName) {
		//String browserName=prop.getProperty("browser");
		//System.out.println("browserName" +browserName);
		if (browserName.contains("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(browserName.contains("firefox")) {
			 driver=new FirefoxDriver();
			}
		else if(browserName.contains("edge")) {
			 driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.setProperty("webdriver.chrome.driver","C:/driverlatest May2023/chromedriver_win32 (7)/chromedriver.exe");
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 //String URL=prop.getProperty("url");
		return driver;
	}
	
	public Properties initprop()  {
		try {
		prop= new Properties();
		FileInputStream ip= new FileInputStream("C:/Users/gp07f/SeleniumAssignment/july2023/src/test/resources/config.txt");
		prop.load(ip);
			}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File not found");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("IO Exception");
		}
		return prop;
	}
}
