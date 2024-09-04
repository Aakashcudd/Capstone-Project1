package automation;

import org.openqa.selenium.By;

public class BookingFormAutomation extends BaseTest {

	public void fillBookingForm() {
        // Fill passenger details
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("dob")).sendKeys("01/01/1980");

        // Fill payment information
        driver.findElement(By.id("creditCardNumber")).sendKeys("4111111111111111");
        driver.findElement(By.id("expirationDate")).sendKeys("12/25");
        driver.findElement(By.id("cvv")).sendKeys("123");

        // Submit the booking
        driver.findElement(By.id("submitBooking")).click();
    }
}
