package apple_India;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Apple_Bag extends Apple_SearchProduct {

	@Test(priority = 2)
	void Bag() {
		
//		(//a[.='Explore'])[1]
//		driver.get("https://www.apple.com/in/");
		driver.findElement(By.xpath("(//a[contains(.,'AirPods (3rd generation)')])[1]")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Search apple.com']")).sendKeys("apple watch", Keys.ENTER);
		driver.findElement(By.xpath("//a[@data-analytics-title='buy - airpods 3rd gen']")).click();
		driver.findElement(By.id("add-to-cart")).click();
		
	/*	WebElement storage = driver.findElement(By.xpath("(//span[contains(.,'64')])[1]"));
		Actions selectStorage = new Actions(driver);
		selectStorage.moveToElement(storage).click().build().perform();
		
		WebElement connectivity = driver.findElement(By.xpath("(//span[contains(.,'Wi-Fi + Cellular')])[1]"));
		Actions cellular = new Actions(driver);
		cellular.moveToElement(connectivity).click().build().perform();
		
		WebElement engrave = driver.findElement(By.xpath("(//span[contains(.,'No Engraving')])[1]"));
		Actions noEngrave = new Actions(driver);
		noEngrave.moveToElement(engrave).click().build().perform();
		
		WebElement bag = driver.findElement(By.xpath("(//span[contains(.,'Add to Bag')])[1]"));
		Actions addToBag = new Actions(driver);
		addToBag.moveToElement(bag).click().build().perform(); */
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
