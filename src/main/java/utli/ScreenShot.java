package utli;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class ScreenShot {

    public static void takeScreenShot(WebDriver driver, String filePath) throws IOException {

        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcFile, new File(filePath));
    }

}
