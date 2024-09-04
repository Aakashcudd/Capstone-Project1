package automation;

import org.openqa.selenium.By;

public class SelectFlight extends BaseTest {

	 public void selectFlight() {
	        // Select the first available flight
	        driver.findElement(By.cssSelector(".flight-selection-button")).click();

	        // Proceed to booking
	        driver.findElement(By.id("proceedToBook")).click();
	    }
	
}
