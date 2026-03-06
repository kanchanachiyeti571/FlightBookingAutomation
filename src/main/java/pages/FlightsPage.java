package pages;

import org.openqa.selenium.*;
public class FlightsPage {

WebDriver driver;

public FlightsPage(WebDriver driver) {
this.driver = driver;
}

public void chooseFlight() {

driver.findElement(By.cssSelector("input[type='submit']")).click();

}

}
