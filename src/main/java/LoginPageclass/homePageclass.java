package LoginPageclass;

import org.openqa.selenium.WebDriver;

public class homePageclass {
WebDriver driver;
	
	public String getTitle() {
		String Title=driver.getTitle();
		return 	Title;
				
	}
}
