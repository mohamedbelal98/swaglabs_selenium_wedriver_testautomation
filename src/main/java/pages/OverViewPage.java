package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage {

    private final WebDriver driver;
    private final By finishButton = By.cssSelector("button[name='finish']");
    private final By overViewText = By.xpath("//div[@class='header_secondary_container']/child::span");

    public OverViewPage(WebDriver driver) {
        this.driver = driver;
    }

    public CompletePage clickFinishButton() {

        driver.findElement(finishButton).click();
        return new CompletePage(driver);
    }

    public String getOverViewText() {

        return driver.findElement(overViewText).getText();
    }

}
