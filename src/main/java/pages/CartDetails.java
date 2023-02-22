package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartDetails {

    private final WebDriver driver;
    private final By removeButton = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    private final By continueShopping = By.xpath("//button[@id='continue-shopping']");
    private final By checkOutButton = By.xpath("//button[@id='checkout']");

    public CartDetails(WebDriver driver) {
        this.driver = driver;
    }

    public CartDetails clickRemoveButton() {

        driver.findElement(removeButton).click();
        return new CartDetails(driver);
    }

    public HomePage clickContinueShopping() {

        driver.findElement(continueShopping).click();
        return new HomePage(driver);
    }

    public String getContinueShoppingText() {

        return driver.findElement(continueShopping).getText();
    }

    public InformationPage clickCheckOutButton() {

        driver.findElement(checkOutButton).click();
        return new InformationPage(driver);
    }

}
