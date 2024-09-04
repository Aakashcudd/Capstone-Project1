package automation;

import org.openqa.selenium.By;

public class LoginAutomation extends BaseTest {

	 public void login() {
	        // Click the login button
	        driver.findElement(By.id("ctl00_HyperLinkLogin")).click();

	        // Enter dummy email and password
	        driver.findElement(By.id("username")).sendKeys("dummyemail@example.com");
	        driver.findElement(By.id("password")).sendKeys("dummyPassword123");

	        // Submit the login form
	        driver.findElement(By.id("loginButton")).click();
	    }
}
