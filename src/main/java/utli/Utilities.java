package utli;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class Utilities {

    public static void takeScreenShot(WebDriver driver, String filePath) throws IOException {

        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcFile, new File(filePath));
    }

    public static void waitStrategyVisibility(WebDriver driver, By element, int timeInSeconds) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void scrollDown(WebDriver driver, WebElement webElement) {

        String script = "arguments[0].scrollIntoView();";
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript(script, webElement);
    }

}
