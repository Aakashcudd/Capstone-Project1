package automation;

import org.openqa.selenium.By;

public class SearchFlights extends BaseTest{

	public void searchOneWayFlight() {
        driver.findElement(By.id("oneWay")).click();
        driver.findElement(By.id("origin")).sendKeys("DEL");
        driver.findElement(By.id("destination")).sendKeys("BOM");
        driver.findElement(By.id("departureDate")).sendKeys("2024-09-15");
        driver.findElement(By.id("searchFlightsButton")).click();
    }

    public void searchRoundTripFlight() {
        driver.findElement(By.id("roundTrip")).click();
        driver.findElement(By.id("origin")).sendKeys("DEL");
        driver.findElement(By.id("destination")).sendKeys("BOM");
        driver.findElement(By.id("departureDate")).sendKeys("2024-09-15");
        driver.findElement(By.id("returnDate")).sendKeys("2024-09-20");
        driver.findElement(By.id("searchFlightsButton")).click();
    }
}
