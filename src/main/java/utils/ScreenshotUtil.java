package utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

public static void takeScreenshot(WebDriver driver, String testName) {

File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

try {

FileUtils.copyFile(src, new File("screenshots/" + testName + ".png"));

} catch (IOException e) {

System.out.println("Screenshot failed");

}

}

}