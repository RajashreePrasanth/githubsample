import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.index.qual.GTENegativeOne;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleclass {

	static WebDriver driver;
	
	public static  void main(String[] args) {
		
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:/driverlatest May2023/chromedriver_win32 (7)/chromedriver.exe");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		gteheaders();
			
	}
		
		public static List<String> gteheaders(){
			System.out.println(driver.getTitle());
		List<WebElement> list= (List<WebElement>) driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));
		
		ArrayList<String> arrlist= new ArrayList<String>();
		
		for (WebElement e: list) {
			String str=e.getText();
			arrlist.add(str);
		}
		
		
			
						
			
		return arrlist;
		
}
}
