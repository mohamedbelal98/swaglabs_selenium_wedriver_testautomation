package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utli.Utilities;

import java.io.IOException;

public class BaseTest {

    WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {

        System.getProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        goHome();

//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());

        loginPage = new LoginPage(driver);

    }

    @BeforeMethod
    public void goHome() {

        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }

    @AfterMethod
    public void failed_screenShot(ITestResult iTestResult) throws IOException {

        if (iTestResult.getStatus() == ITestResult.FAILURE) {
            Utilities.takeScreenShot(driver, "src/main/java/screen_shoot/" + iTestResult.getName() + ".png");
        }

    }

}
