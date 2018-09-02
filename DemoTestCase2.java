import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code - test case
		
				// Create driver object for Chrome browser
				
				// We will strictly implement methods of webdriver
				
				// invoke exec file first
				// webdriver.chrome.driver /Users/ramn/selenium/
				// webdriver.gecko.driver
				// webdriver.ie.driver 
				System.setProperty("webdriver.gecko.driver", "/Users/ramn/Projects/selenium/geckodriver");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.google.com");
				System.out.println(driver.getTitle());
	}

}
