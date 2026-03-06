package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

WebDriver driver;

public HomePage(WebDriver driver) {
this.driver = driver;
}

public void selectCities() {

Select fromCity = new Select(driver.findElement(By.name("fromPort")));
fromCity.selectByVisibleText("Boston");

Select toCity = new Select(driver.findElement(By.name("toPort")));
toCity.selectByVisibleText("London");

}

public void clickFindFlights() {

driver.findElement(By.cssSelector("input[type='submit']")).click();

}

}
