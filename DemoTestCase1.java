import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// selenium code - test case
		
		// Create driver object for Chrome browser
		
		// We will strictly implement methods of webdriver
		
		// invoke exec file first
		// webdriver.chrome.driver /Users/ramn/selenium/
		// webdriver.gecko.driver
		// webdriver.ie.driver 
		System.setProperty("webdriver.chrome.driver", "/Users/ramn/Projects/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.wsj.com");
		System.out.println(driver.getTitle());
	}

}
