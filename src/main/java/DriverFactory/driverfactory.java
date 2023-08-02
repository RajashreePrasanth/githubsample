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
	
	public WebDriver initBrowser() {
		String browser=prop.getProperty("browser");
		System.out.println("browserName" +browser);
		
		if (browser.contains("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(browser.contains("firefox")) {
			 driver=new FirefoxDriver();
			}
		else if(browser.contains("edge")) {
			 driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.setProperty("webdriver.chrome.driver","C:/driverlatest May2023/chromedriver_win32 (7)/chromedriver.exe");
		
		 String URL=prop.getProperty("url");
		 
		 driver.get(URL);
		return driver;
	}
	public Properties initprop()  {
		try {
		prop= new Properties();
		FileInputStream ip= new FileInputStream("C:/Users/gp07f/SeleniumAssignment/july2023/src/test/resources/config.properties");
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
