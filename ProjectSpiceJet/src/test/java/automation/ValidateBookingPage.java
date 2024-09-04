package automation;

import org.openqa.selenium.By;

public class ValidateBookingPage extends BaseTest {

	 public void validateFields() {
	        driver.findElement(By.linkText("Check-in")).click();
	        driver.findElement(By.linkText("Flight Status")).click();
	        driver.findElement(By.linkText("Manage Booking")).click();
	    }
}
