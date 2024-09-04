package automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyBooking extends BaseTest {

	@Test // Add TestNG annotations
	 public void verifyBooking() {
		
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized. Please initialize it in BaseTest.");
        }

	        String confirmationMessage = driver.findElement(By.id("confirmationMessage")).getText();
	        if (confirmationMessage.contains("Booking Confirmed")) {
	            System.out.println("Booking was successful.");
	        } else {
	            System.out.println("Booking failed.");
	        }
	    }
}
