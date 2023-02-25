package apple_India;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestRun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/in/");
		driver.findElement(By.xpath("(//span[contains(.,'Shopping Bag')])[2]//parent::a")).click();
	
		WebElement Bag = driver.findElement(By.xpath("(//a[contains(.,'Bag')])[3]"));
	
		Actions hover = new Actions(driver);
		hover.moveToElement(Bag).click().build().perform();
		
		driver.findElement(By.xpath("(//span[.='Check Out'])[2]")).click();
			 
	}

}
