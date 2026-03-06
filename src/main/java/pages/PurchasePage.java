package pages;

import org.openqa.selenium.*;

public class PurchasePage {

WebDriver driver;

public PurchasePage(WebDriver driver) {
this.driver = driver;
}

public void enterPassengerDetails() {

driver.findElement(By.id("inputName")).sendKeys("Kanchana");
driver.findElement(By.id("address")).sendKeys("AP");
driver.findElement(By.id("city")).sendKeys("Pithapuram");
driver.findElement(By.id("state")).sendKeys("AP");
driver.findElement(By.id("zipCode")).sendKeys("533450");

}

public void enterPaymentDetails() {

driver.findElement(By.id("creditCardNumber")).sendKeys("1234567812345678");
driver.findElement(By.id("nameOnCard")).sendKeys("Kanchana");

}

public void clickPurchaseFlight() {

driver.findElement(By.cssSelector("input[type='submit']")).click();

}
}
