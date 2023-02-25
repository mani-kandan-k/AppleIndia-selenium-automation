package apple_India;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Apple_CheckOut extends Apple_Bag {

	@Test(priority = 3)
	void CheckOut() {
		
		driver.findElement(By.id("shoppingCart.actions.checkout")).click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
