import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookreg {
	
	static WebDriver driver;
	
	public static  void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:/driverlatest May2023/chromedriver_win32 (7)/chromedriver.exe");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("rajashree" );
}

}
