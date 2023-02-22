package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    private final By userNameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.name("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserNameInput(String userName) {

        driver.findElement(userNameInput).sendKeys(userName);
    }

    public void setPasswordInput(String password) {

        driver.findElement(passwordInput).sendKeys(password);
    }

    public HomePage clickLoginButton() {

        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

}
