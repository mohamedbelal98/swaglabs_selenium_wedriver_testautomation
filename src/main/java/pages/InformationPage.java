package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage {

    private final WebDriver driver;
    private final By firstNameInput = By.id("first-name");
    private final By lastNameInput = By.id("last-name");
    private final By postalCodeInput = By.id("postal-code");
    private final By continueButton = By.id("continue");

    public InformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstNameInput(String firstName) {

        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void setLastNameInput(String lastName) {

        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void setPostalCodeInput(String postalCode) {

        driver.findElement(postalCodeInput).sendKeys(postalCode);
    }

    public OverViewPage clickContinueButton(){

        driver.findElement(continueButton).click();
        return  new OverViewPage(driver);
    }

}
