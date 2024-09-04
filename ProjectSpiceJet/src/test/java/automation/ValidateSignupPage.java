package automation;

import org.openqa.selenium.By;

public class ValidateSignupPage extends BaseTest {

	 public void validateSignup() {
	        // Navigate to SignUp page
	        driver.findElement(By.linkText("Signup")).click();

	        // Fill out mandatory fields
	        driver.findElement(By.id("firstName")).sendKeys("John");
	        driver.findElement(By.id("lastName")).sendKeys("Doe");
	        driver.findElement(By.id("email")).sendKeys("john.doe@example.com");
	        driver.findElement(By.id("password")).sendKeys("password123");

	        // Fill out non-mandatory fields
	        driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");

	        // Submit the form
	        driver.findElement(By.id("signupButton")).click();
	    }
	
}
