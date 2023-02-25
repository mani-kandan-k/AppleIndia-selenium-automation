package apple_India;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Apple_SearchProduct extends WebDriver_AppleIndia {

	@Test(priority = 1)
	void SearchProduct() {
		
		driver.get("https://www.apple.com/in/"); driver.getTitle();
		driver.findElement(By.xpath("//li[@role='search']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apple.com']")).sendKeys("airpod", Keys.ENTER);
	}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub

	}

}
