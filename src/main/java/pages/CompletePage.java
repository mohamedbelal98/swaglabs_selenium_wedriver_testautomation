package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage {

    private final WebDriver driver;
    private final By thankYouText = By.className("complete-header");

    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getThankYouText() {

        return driver.findElement(thankYouText).getText();
    }

}
