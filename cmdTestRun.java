package apple_India;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cmdTestRun {

	public static void main(String[] args) {

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.apple.com/in/");
		
	}

}
