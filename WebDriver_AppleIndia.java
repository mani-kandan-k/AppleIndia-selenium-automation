package apple_India;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class WebDriver_AppleIndia {

	WebDriver driver;
	
	@BeforeTest
	void launch() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Java\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
